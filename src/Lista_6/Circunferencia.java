/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Circunferencia extends AreaDeElementos{
    private int raio;
    Circunferencia(int raio){
        this.raio = raio;
    }
    
    @Override
    public double calculaArea(){
        return (3.14/2*this.raio*this.raio);
    }
}
