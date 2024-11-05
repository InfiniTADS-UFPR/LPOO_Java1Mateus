/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_4;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class UsaCircunferencia {
    public static void main(String[] args){
        Circunferencia c1 = new Circunferencia();
        Scanner scan = new Scanner(System.in);
        int raio = scan.nextInt();
        c1.setRaio(raio);
        Double valor = c1.calculaRaio();
        System.out.println("Raio valendo "+c1.getRaio()+": "+valor);
        c1.setRaio(5);
        valor = c1.calculaRaio();
        System.out.println("Raio valendo 5: "+valor);
        c1.setRaio(6);
        valor = c1.calculaRaio();
        System.out.println("Raio valendo 6: "+valor);
        Circunferencia c2 = new Circunferencia();
        c2.setRaio(15);
        valor = c2.calculaRaio();
        System.out.println("Raio valendo 6: "+valor);
    }
}
