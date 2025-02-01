package br.ufpr.lpoo.tarefa02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o primeiro ponto (x, y)");
            System.out.print("x: ");
            x1 = scanner.nextDouble();
            System.out.print("y: ");
            y1 = scanner.nextDouble();
            System.out.println("Informe o segundo ponto (x, y)");
            System.out.print("x: ");
            x2 = scanner.nextDouble();
            System.out.print("y: ");
            y2 = scanner.nextDouble();

            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.printf("Distancia entre os pontos: %.1f", distancia);
        } catch (InputMismatchException e) {
            System.out.println("Informe um numero valido.");
        }
    }
}
