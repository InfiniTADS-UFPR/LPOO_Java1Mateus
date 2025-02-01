package br.ufpr.lpoo.tarefa08.exercicio4;

public class Disciplina {
private String nome;
    private Professor professor;
    private int cargaHoraria;

    public Disciplina(String nome, Professor professor, int cargaHoraria) {
        this.nome = nome;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
        this.professor.getDisciplinasMinistradas().add(this);
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor.toString();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return nome + " (" + professor.getNome() + ") " + cargaHoraria + " horas";
    }
}
