/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class CalculaArea {
    public static void main(String[] args){
        Quadrado q1 = new Quadrado(9);
        Quadrado q2 = new Quadrado(2);
        Triangulo t1 = new Triangulo(4,5);
        Triangulo t2 = new Triangulo(2,9);
        Circunferencia c1 = new Circunferencia(2);
        Circunferencia c2 = new Circunferencia(5);
        
        AreaDeElementos[] lista = new AreaDeElementos[6];
        
        lista[0] = q1;
        lista[1] = q2;
        lista[2] = t1;
        lista[3] = t2;
        lista[4] = c1;
        lista[5] = c2;
        
        double saida = 0.0;
        
        for (AreaDeElementos e : lista ){
            saida += e.calculaArea();
        }
        System.out.println("Area somada dos objetos declarados é: "+saida);
    }
}
