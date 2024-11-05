/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class UsaVeiculos {
    public static void main(String[] args){
        int numero = 0, i=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos veiculos deseja?");
        numero = scan.nextInt();
        
        Veiculo[] lista = new Veiculo[numero];
        
        for (i = 0; i<numero;i++){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Escolha ai:\n1. Carro\n2. Trem\n3. Avião\n4. Barco\n");
            int opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scan1.nextLine();
                    System.out.println("Numero de Rodas: ");
                    int nRodas= scan1.nextInt();
                    System.out.println("Numero de lugares: ");
                    int lugares = scan1.nextInt();
                    System.out.println("Velocidade: ");
                    double velocidade = scan1.nextDouble();
                    Carro c = new Carro(nome, nRodas, lugares,velocidade);
                    lista [i] = c;
                    break;
                case 2:
                    System.out.println("Nome: ");
                    String nomet = scan1.nextLine();
                    System.out.println("Numero de Rodas: ");
                    int nRodast= scan1.nextInt();
                    System.out.println("Numero de lugares: ");
                    int lugarest = scan1.nextInt();
                    System.out.println("Numero de vagões: ");
                    int nVagoest = scan1.nextInt();
                    Trem t = new Trem(nomet, nRodast, lugarest,nVagoest);
                    lista [i] = t;
                    break;
                case 3:
                    System.out.println("Nome: ");
                    String nomea = scan1.nextLine();
                    System.out.println("Numero de Rodas: ");
                    int nRodasa= scan1.nextInt();
                    System.out.println("Modelo: ");
                    String modeloa = scan1.nextLine();
                    String nomeq = scan1.nextLine();
                    System.out.println("Lugares: ");
                    int lugaresa = scan1.nextInt();
                    Aviao a = new Aviao(nomea, nRodasa, nomeq,lugaresa);
                    lista [i] = a;
                    break;
                case 4:
                    System.out.println("Nome: ");
                    String nomeb = scan1.nextLine();
                    System.out.println("Numero de Rodas: ");
                    int nRodasb = scan1.nextInt();
                    System.out.println("Onde: ");
                    String onde = scan1.nextLine();
                    String nomew = scan1.nextLine();
                    System.out.println("Lugar: ");
                    String lugar = scan1.nextLine();
                    Barco b = new Barco(nomeb, nRodasb, nomew,lugar);
                    lista [i] = b;
                    break;
            }
        }
        for (Veiculo v : lista){
            v.andar();
        }
    }
}
