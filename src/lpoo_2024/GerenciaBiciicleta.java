/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_2024;

/**
 *
 * @author mateus
 */
public class GerenciaBiciicleta {
    public static void main(String[] args){
        Bicicleta bikeDoMateus = new Bicicleta();
        Bicicleta bikeDaEmily = new Bicicleta(); 
        
        bikeDoMateus.mudaMarcha(3);
        bikeDoMateus.pedalar(10,1.0);
        bikeDoMateus.imprimeEstado();
        bikeDoMateus.mudaMarcha(8);
        bikeDaEmily.pedalar(10,1.0);
        bikeDaEmily.pedalar(10,0.5);
        bikeDaEmily.frear(2);
        bikeDaEmily.imprimeEstado();
    }
    
}
