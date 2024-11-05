/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Quadrado extends AreaDeElementos {
    private int lado;
    
    Quadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaArea(){
        return this.lado*this.lado;
    }
}
