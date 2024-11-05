/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Triangulo extends AreaDeElementos {
    private int base,altura;
    
    Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return (this.base*this.altura/2);
    }
    
}
