package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class SistemaAcademico {
    private static JFrame frame;
    private final ArrayList<Aluno> alunosLista = new ArrayList<>();
    private final ArrayList<Disciplina> disciplinasLista = new ArrayList<>();
    private final ArrayList<Professor> professoresLista = new ArrayList<>();
    private JPanel menu;
    private JLabel title;
    private JTabbedPane tabbedPane1;
    private JPanel alunos;
    private JPanel professores;
    private JPanel disciplinas;
    private JTable listaProfessores;
    private JTextField tituloProfessor;
    private JTextField enderecoProfessor;
    private JTextField nomeProfessor;
    private JTextField idadeProfessor;
    private JButton cadastrarProfButton;
    private JTable tabelaDisciplinas;
    private JSpinner inputCargaHoraria;
    private final SpinnerListModel cargasHorarias = new SpinnerListModel(Arrays.asList(30,60,90));
    private JTextField nomeDisciplina;
    private JComboBox comboProfs;
    private final DefaultComboBoxModel<Professor> comboProfsModel = new DefaultComboBoxModel<>();
    private JButton cadastrarDiscButton;
    private JTable tabelaAlunos;
    private JButton cadastrarAlunoButton;
    private JTextField nomeAluno;
    private JTextField matriculaAluno;
    private JTextField cursoAluno;
    private JSpinner inputDiscPermitidas;
    private JSpinner periodoAluno;
    private JTextField enderecoAluno;
    private JTextField idadeAluno;

    public SistemaAcademico() {
        ProfessorTableModel professorModel = new ProfessorTableModel(professoresLista);
        DisciplinaTableModel disciplinaModel = new DisciplinaTableModel(disciplinasLista);
        AlunoTableModel alunoModel = new AlunoTableModel(alunosLista);
        listaProfessores.setModel(professorModel);
        tabelaDisciplinas.setModel(disciplinaModel);
        tabelaAlunos.setModel(alunoModel);
        inputCargaHoraria.setModel(cargasHorarias);
        atualizaComboProfs();
        comboProfs.setModel(comboProfsModel);

        cadastrarProfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeProfessor.getText();
                String titulo = tituloProfessor.getText();
                int idade = Integer.parseInt(idadeProfessor.getText());
                String endereco = enderecoProfessor.getText();
                Professor professor = new Professor(nome, idade, endereco, titulo);
                professoresLista.add(professor);
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                nomeProfessor.setText("");
                tituloProfessor.setText("");
                idadeProfessor.setText("");
                enderecoProfessor.setText("");
                professorModel.fireTableDataChanged();
                atualizaComboProfs();
            }
        });

        listaProfessores.getSelectionModel().addListSelectionListener(e -> {
            if(listaProfessores.getSelectedRow() != -1){
                Professor prof = professoresLista.get(listaProfessores.getSelectedRow());
                ProfessorDisciplinas modal = new ProfessorDisciplinas(frame, prof);
                modal.setVisible(true);
                listaProfessores.clearSelection();
            }
        });

        cadastrarDiscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeDisciplina.getText();
                int cargaHoraria = (int) inputCargaHoraria.getValue();
                Professor prof = (Professor) comboProfs.getSelectedItem();
                Disciplina disc = new Disciplina(nome, prof, cargaHoraria);
                disciplinasLista.add(disc);
                JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
                disciplinaModel.fireTableDataChanged();
            }
        });

        cadastrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeAluno.getText();
                int idade = Integer.parseInt(idadeAluno.getText());
                String endereco = enderecoAluno.getText();
                String matricula = matriculaAluno.getText();
                String curso = cursoAluno.getText();
                int periodo = (int) periodoAluno.getValue();
                int disciplinasPermitidas = (int) inputDiscPermitidas.getValue();
                Aluno aluno = new Aluno(nome, idade, endereco, matricula, curso, periodo, disciplinasPermitidas);
                alunosLista.add(aluno);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
                alunoModel.fireTableDataChanged();
            }
        });

        tabelaAlunos.getSelectionModel().addListSelectionListener(e -> {
            if(tabelaAlunos.getSelectedRow() != -1){
                Aluno aluno = alunosLista.get(tabelaAlunos.getSelectedRow());
                if(tabelaAlunos.getSelectedColumn() == 6){
                    if(JOptionPane.showConfirmDialog(null, "Certeza que deseja excluir "+aluno.getNome()+"?") == JOptionPane.YES_OPTION){
                        alunosLista.remove(aluno);
                        JOptionPane.showMessageDialog(null, "Aluno "+aluno.getNome()+" excluído");
                        alunoModel.fireTableDataChanged();
                    }
                } else if(tabelaAlunos.getSelectedColumn() == 5){
                    DisciplinasAluno modal = new DisciplinasAluno(aluno, SistemaAcademico.frame, disciplinasLista);
                    modal.setVisible(true);
                }
                tabelaAlunos.clearSelection();
            }
        });
    }

    public void atualizaComboProfs(){
        comboProfsModel.removeAllElements();
        for (Professor prof : professoresLista){
            comboProfsModel.addElement(prof);
        }
    }

    public static void main(String[] args) {
        frame = new JFrame("Sistema Acadêmico");
        frame.setContentPane(new SistemaAcademico().menu);
        Dimension dimension = new Dimension(800,500);
        frame.setMinimumSize(dimension);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
