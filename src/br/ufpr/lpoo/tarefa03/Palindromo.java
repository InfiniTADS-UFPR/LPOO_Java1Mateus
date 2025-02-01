package br.ufpr.lpoo.tarefa03;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String frase = s.nextLine();
        frase = frase.toLowerCase().replaceAll("[^a-z]", "");
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.printf("Frase original: %s\nFrase invertida: %s\n", frase, fraseInvertida);
        System.out.println(frase.equals(fraseInvertida) ? "É um palíndromo" : "Não é um palíndromo");
    }
}