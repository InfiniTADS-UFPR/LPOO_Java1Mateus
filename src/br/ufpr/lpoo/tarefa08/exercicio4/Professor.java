package br.ufpr.lpoo.tarefa08.exercicio4;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private final String titulo;
    private final ArrayList<Disciplina> disciplinasMinistradas = new ArrayList<>();

    public Professor(String nome, int idade, String endereco, String titulo) {
        super(nome, idade, endereco);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    @Override
    public String toString(){
        return this.titulo + " " +this.getNome();
    }
}
