/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Trem extends VeiculoTerrestre {
    protected int nVagoes;
    
    Trem(String nome, int nRodas, int lugares, int nVagoes){
        super(nome,nRodas,lugares);
        this.nVagoes = nVagoes;
    }
    
    @Override
    public void andar(){
        System.out.println(this.nome+"andando nos trilhos com "+nRodas+" rodas e "+lugares+" lugares dentro dos "+nVagoes+" vagões.");
    }
}
