package br.ufpr.lpoo.tarefa06.exercicio4;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private final String titulo;
    private final ArrayList<Disciplina> disciplinasMinistradas = new ArrayList<>();

    public Professor(String nome, int idade, String endereco, String titulo) {
        super(nome, idade, endereco);
        this.titulo = titulo;
    }

    public ArrayList<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    @Override
    public String toString(){
        StringBuilder professor = new StringBuilder();
        professor.append("-".repeat(50)).append("\n");
        professor.append(this.titulo).append(" ").append(this.getNome());
        professor.append("\n");
        for (Disciplina disc : disciplinasMinistradas){
            professor.append(disc.getNome()).append(", ");
        }
        professor.append("\n");
        professor.append("-".repeat(50));
        return professor.toString();
    }
}
