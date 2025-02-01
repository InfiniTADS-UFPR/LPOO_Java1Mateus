package br.ufpr.lpoo.tarefa03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        double soma = 0, entrada;
        for(int i = 0; i < 20; i++){
            System.out.printf("%d. -> ", i + 1);
            Scanner s = new Scanner(System.in);
            try {
                entrada = s.nextDouble();
                if (entrada % 2 == 0) {
                    soma += entrada;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um argumento válido...");
                i--;
            }
        }

        System.out.printf("Soma dos valores pares: %.1f\n", soma);
        System.out.print("\n");
    }
}
