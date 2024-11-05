package LPOO2_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class Tarefa11 {
    
    static double area;
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual a forma? 1 - Retangulo; 2 - Circulo; 3 - Triangulo:");
        int opcao = scan.nextInt();
        switch(opcao){
            case 1:
                Tarefa11.calculaAreaRetangulo(2,3);
                break;
            case 2: 
                Tarefa11.calculaAreaCircunferencia(1);
                break;
            case 3: 
                Tarefa11.calcularAreaTriangulo(2, 2);
                break;
        }
    }
    
    
    public static double calculaAreaRetangulo(double lado1, double lado2){
        area = lado1*lado2;
        return area;
    }
    
    public static double calculaAreaCircunferencia(double raio){
        area = raio*raio*3.14;
        return area;
    }
    
    public static double calcularAreaTriangulo(double base, double altura){
        area = (base*altura)/2;
        return area;
    }
    
}
