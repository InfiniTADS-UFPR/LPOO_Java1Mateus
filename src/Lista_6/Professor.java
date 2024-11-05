/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Professor extends Pessoa {
    private Disciplina[] disciplinas;
    private int numero, total=0;
    Professor(String nome, int idade, int numero){
        super(nome,idade);
        this.numero = numero;
        disciplinas = new Disciplina[numero];
    }
    
    public void cadastraDisciplina(Disciplina disciplina){
        if (disciplinas.length<total){
            disciplinas[total] = disciplina;
            total++;
        } else {
            System.out.println("Total de disciplinas alcançadas!");
        }
    }
}
