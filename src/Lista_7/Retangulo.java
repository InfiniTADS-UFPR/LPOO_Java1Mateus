/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

/**
 *
 * @author mateus
 */
public class Retangulo{
    private int lado1, lado2;
    
    void setRetangulo(int lado1,int lado2) throws IllegalArgumentException{
        if (lado1 <0 || lado2<0)
            throw new IllegalArgumentException("Nenhum dos lados pode ser negativo!!!");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void calculaArea(){
        System.out.println(this.lado1*this.lado2);
    }
}
