package br.ufpr.lpoo.tarefa02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Baskhara {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o valor de a: ");
            a = scanner.nextInt();
            System.out.println("Informe o valor de b: ");
            b = scanner.nextInt();
            System.out.println("Informe o valor de c: ");
            c = scanner.nextInt();

            System.out.println("Expressão: " + a + "x^2 + " + b + "x + " + c + " = 0");

            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Nao existem raizes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f, x2 = %.2f", x1, x2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Informe um numero inteiro.");
        }
    }
}
