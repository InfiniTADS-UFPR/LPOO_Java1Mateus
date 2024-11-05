/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public interface Superficie {
    
    public static void main (String[] args){
        Circunferencia1 c = new Circunferencia1(2);
        Quadrado1 q = new Quadrado1(4);
        
        Superficie s = c;
        
        double tamanho = s.area();
        System.out.println(tamanho);
        s = q;
        tamanho = s.area();
        System.out.println(tamanho);
        
    }
        public double area();

}
