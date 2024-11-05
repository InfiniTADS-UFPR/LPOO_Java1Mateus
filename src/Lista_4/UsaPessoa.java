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
public class UsaPessoa {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome");
        String name = scan.nextLine();
        System.out.println("Digite a idade (numero inteiro)");
        int idade = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Digite o endereço");
        String end = scan1.nextLine();
        p.setIdade(idade);
        p.setNome(name);
        p.setEnd(end);
        p.getNome();
        p.getIdade();
        p.getEnd();
        p.fazAniversario();
        p.fazAniversario();
        p.fazAniversario();
        p.fazAniversario();
        p.fazAniversario();
        p.imprime();
    }
}
