package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DisciplinaTableModel extends AbstractTableModel {
    private final ArrayList<Disciplina> disciplinas;
    private final String[] colunas = {"Nome", "Carga horária", "Professor"};

    public DisciplinaTableModel(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int getRowCount() {
        return disciplinas.size();
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
        Disciplina disc = disciplinas.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> disc.getNome();
            case 1 -> disc.getCargaHoraria();
            case 2 -> disc.getProfessor();
            default -> null;
        };
    }
}
