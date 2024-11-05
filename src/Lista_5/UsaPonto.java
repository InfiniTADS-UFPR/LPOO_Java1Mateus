/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

import Lista_4.*;
import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class UsaPonto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ponto3D p1 = new Ponto3D();
        System.out.println("Digite os pontos do p1(digite enter entre os pontos)");
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        Double z = scan.nextDouble();
        p1.setXYZ(x,y,z);
        System.out.println("Digite os pontos do p2(digite enter entre os pontos)");
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();
        Ponto3D p2 = new Ponto3D();
        p2.setXYZ(x, y, z);
        p1.calculaDistancia(p2);
    }
}
