package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class AlunoTableModel extends AbstractTableModel {
    private final ArrayList<Aluno> alunos;
    private final String[] colunas = {"Matrícula", "Nome", "Idade", "Curso", "Período", "Disciplinas", "Remover"};

    public AlunoTableModel(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int coluna){
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = alunos.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> aluno.getMatricula();
            case 1 -> aluno.getNome();
            case 2 -> aluno.getIdade();
            case 3 -> aluno.getCurso();
            case 4 -> aluno.getPeriodo();
            case 5 -> "Clique para ver";
            case 6 -> "Clique para remover";
            default -> null;
        };
    }
}
