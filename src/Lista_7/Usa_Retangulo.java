/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

/**
 *
 * @author mateus
 */
public class Usa_Retangulo {
    public static void main(String[] args){
       try{
        Retangulo r = new Retangulo();
        r.setRetangulo(1, 1);
        r.calculaArea();
        
        Retangulo r2 = new Retangulo();
        r2.setRetangulo(-1, 0);
       
       } catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
        
    
    }
    
}
