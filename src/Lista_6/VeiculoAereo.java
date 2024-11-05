/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public abstract class VeiculoAereo extends Veiculo{
    protected String modelo;
    
    VeiculoAereo(String nome, int nRodas, String modelo){
        super(nome,nRodas);
        this.modelo=modelo;
    }
    
}
