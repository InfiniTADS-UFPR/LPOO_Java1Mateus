package br.ufpr.lpoo.tarefa08.exercicio4;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DisciplinasMatriculadasTableModel extends AbstractTableModel {
    private final ArrayList<Disciplina> disciplinasMatriculadas;
    private final int quantidadePermitida;

    public DisciplinasMatriculadasTableModel(int quantidade, ArrayList<Disciplina> disciplinasMatriculadas) {
        this.quantidadePermitida = quantidade;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    @Override
    public int getRowCount() {
        return this.quantidadePermitida;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int coluna){
        return coluna == 0 ? "Disciplina" : "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try{
            Disciplina disc = disciplinasMatriculadas.get(rowIndex);
            return columnIndex == 0 ? disc.toString() : "Cancelar matrícula";
        }catch (IndexOutOfBoundsException e){
            return "";
        }
    }
}
