/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Carro extends VeiculoTerrestre {
    protected double velocidade;
    
    Carro(String nome, int nRodas, int lugares, double velocidade){
        super(nome,nRodas,lugares);
        this.velocidade= velocidade;
    }
    
    @Override
    public void andar() {
        System.out.println(this.nome + " andando na estrada a " + this.velocidade + " com " + this.nRodas + " rodas e com " + this.lugares + " lugares.");
    }
    
}
