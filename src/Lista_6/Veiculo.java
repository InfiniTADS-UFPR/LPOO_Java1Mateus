/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public abstract class Veiculo {
    protected String nome;
    protected int nRodas;
    
    Veiculo(String nome,int nRodas){
        this.nome = nome;
        this.nRodas = nRodas;
    };
    
    public abstract void andar();
    
}
