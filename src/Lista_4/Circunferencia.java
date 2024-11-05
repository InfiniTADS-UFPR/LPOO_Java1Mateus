/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_4;

/**
 *
 * @author mateus
 */
public class Circunferencia {
    private int raio;
    
    public void setRaio(int raio){
        this.raio = raio;
    }
    
    public int getRaio(){
        return this.raio;
    }
    
    public double calculaRaio(){
        double circunf = 2*3.14*raio;
        return circunf;
    }
}
