/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public abstract class VeiculoAquatico extends Veiculo {
    protected String onde;
    VeiculoAquatico(String nome, int nRodas, String onde){
        super(nome, nRodas);
        this.onde = onde;
    }
    
}
