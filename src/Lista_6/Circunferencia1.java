/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Circunferencia1 implements Superficie{
    protected int raio;
    Circunferencia1(int raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14*this.raio*this.raio;
    }
    
}
