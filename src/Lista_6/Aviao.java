/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Aviao extends VeiculoAereo{
    protected int lugares;
    
    Aviao(String nome, int nRodas, String modelo, int lugares){
        super(nome,nRodas,modelo);
        this.lugares = lugares;
    }

    @Override
    public void andar() {
        System.out.println(this.nome+" voando com "+this.lugares+" lugares sendo um "+modelo+" e tendo suas "+nRodas+" rodas.");
    }
    
}
