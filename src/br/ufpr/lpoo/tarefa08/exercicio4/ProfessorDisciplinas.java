package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfessorDisciplinas extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JList disciplinas;
    private JLabel nomeProfessor;

    public ProfessorDisciplinas(JFrame pai, Professor professor) {
        super(pai, "Detalhes Professor", true);
        nomeProfessor.setText(professor.getNome());
        setContentPane(contentPane);
        setModal(true);
        setSize(450,350);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonOK);

        DefaultListModel<String> disciplinasModel = new DefaultListModel<>();
        for (Disciplina disc : professor.getDisciplinasMinistradas()){
            disciplinasModel.addElement(" - "+disc.getNome());
        }
        disciplinas.setModel(disciplinasModel);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        dispose();
    }
}
