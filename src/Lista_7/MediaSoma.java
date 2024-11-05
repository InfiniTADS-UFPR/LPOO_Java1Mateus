/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class MediaSoma {
    public static void main(String[] args){
        int cont=0;
        double valor = 0;
        while(true){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite s ou S para sair ou um numero para fazer a media:");
                String input = scan.next();
                if (input.equalsIgnoreCase("s")){
                    break;
                }
                valor += Double.parseDouble(input);
                cont++;

            } catch(Exception e) {
                System.out.println("Valor digitado não é um inteiro, tente novamente.");
            }
        }
        System.out.println("Média é: "+(valor/cont));
    }
}