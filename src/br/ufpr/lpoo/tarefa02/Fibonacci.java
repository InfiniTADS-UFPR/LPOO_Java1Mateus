package br.ufpr.lpoo.tarefa02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        try{
            int n = scanner.nextInt();
            fibonacci(n, 0, 1);
        } catch (InputMismatchException e) {
            System.out.println("Informe um numero inteiro.");
        }
    }

    public static void fibonacci(int n, int a, int b) {
        System.out.print(a+" ");
        if (a > n) {
            return;
        }
        fibonacci(n, b, a + b);
    }
}
