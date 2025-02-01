package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DisciplinasAluno extends JDialog {
    private final DefaultComboBoxModel<Disciplina> comboDisciplinas = new DefaultComboBoxModel<>();
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel nomeAluno;
    private JTable tabelaDisciplinas;
    private JComboBox disciplinasValidas;
    private JButton matricularButton;
    private Disciplina disciplinaSelecionada;

    public DisciplinasAluno(Aluno aluno, JFrame pai, ArrayList<Disciplina> disciplinas) {
        super(pai, "Disciplinas "+aluno.getNome(), true);
        nomeAluno.setText(aluno.getNome());
        for(Disciplina disc : disciplinas){
            comboDisciplinas.addElement(disc);
        }
        disciplinasValidas.setModel(comboDisciplinas);
        DisciplinasMatriculadasTableModel tableModel = new DisciplinasMatriculadasTableModel(aluno.getQuantidadeDisciplinasPermitidas(), aluno.getDisciplinasMatriculadas());
        tabelaDisciplinas.setModel(tableModel);
        setContentPane(contentPane);
        setModal(true);
        setSize(600,400);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        disciplinasValidas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                matricularButton.setEnabled(true);
                disciplinaSelecionada = (Disciplina) disciplinasValidas.getSelectedItem();
            }
        });

        matricularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, aluno.fazMatricula(disciplinaSelecionada));
                tableModel.fireTableDataChanged();
            }
        });

        tabelaDisciplinas.getSelectionModel().addListSelectionListener(e -> {
            if(tabelaDisciplinas.getSelectedRow() != -1){
                Disciplina disc = aluno.getDisciplinasMatriculadas().get(tabelaDisciplinas.getSelectedRow());
                if(tabelaDisciplinas.getSelectedColumn() == 1){
                    if(JOptionPane.showConfirmDialog(null, "Certeza de que deseja cancelar a matrícula?") == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, aluno.cancelarMatricula(disc));
                    }
                }
                tabelaDisciplinas.clearSelection();
            }
        });
    }

    private void onOK() {
        dispose();
    }
}
