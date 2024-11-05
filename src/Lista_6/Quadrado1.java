/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Quadrado1 implements Superficie {
    private int lado;
    
    Quadrado1(int lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }
}
