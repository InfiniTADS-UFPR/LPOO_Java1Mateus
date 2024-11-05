/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Barco extends VeiculoAquatico {
    protected String lugar;

    Barco(String nome, int nRodas, String onde, String lugar){
        super(nome, nRodas, onde);
        this.lugar = lugar;
    }
    
    @Override
    public void andar() {
        System.out.println(this.nome+" navegando no "+lugar+" e atracando no "+onde+" com suas "+nRodas+" rodas.");
    }
    
}
