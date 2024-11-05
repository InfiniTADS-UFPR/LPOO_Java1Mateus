/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_4;

/**
 *
 * @author mateus
 */
public class Pessoa {
    private String nome,endereco;
    private int idade;
    
    public void getIdade(){
        System.out.println(this.idade);
    }
    
    public void getNome(){
        System.out.println(this.nome);
    }
    
    public void getEnd(){
        System.out.println(this.endereco);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEnd(String endereco){
        this.endereco = endereco;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void fazAniversario(){
        this.idade++;
    }
    
    public void imprime(){
        System.out.println("O nome informado é "+this.nome+" cuja idade é "+this.idade+" e mora no "+this.endereco);
    }
    
}
