/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateus
 */
public class Disciplina {
    private String nome;
    private List<String> alunos = new ArrayList<>();
    private Professor profe;
    
    Disciplina(String nome, Professor professor){
        this.nome=nome;
        this.profe = professor;
    }
    
    public void adicionaDisciplina(String aluno){
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfe() {
        return profe;
    }

    public void setProfe(Professor profe) {
        this.profe = profe;
    }
}
