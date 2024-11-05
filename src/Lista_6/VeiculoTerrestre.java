/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public abstract class VeiculoTerrestre extends Veiculo {
    protected int lugares;
    VeiculoTerrestre(String nome, int nRodas, int lugares){
        super(nome, nRodas);
        this.lugares = lugares;
    }
}
