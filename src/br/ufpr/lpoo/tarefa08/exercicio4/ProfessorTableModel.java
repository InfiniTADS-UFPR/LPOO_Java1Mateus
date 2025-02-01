package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ProfessorTableModel extends AbstractTableModel {
    private final ArrayList<Professor> professores;
    private final String[] colunas = {"Nome", "Título", "Idade", "Detalhes"};

    public ProfessorTableModel(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    @Override
    public int getRowCount() {
        return professores.size();
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
        Professor prof = professores.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> prof.getNome();
            case 1 -> prof.getTitulo();
            case 2 -> prof.getIdade();
            case 3 -> "Clique para ver";
            default -> null;
        };
    }
}
