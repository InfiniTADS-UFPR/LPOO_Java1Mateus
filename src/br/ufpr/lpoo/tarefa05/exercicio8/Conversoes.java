package br.ufpr.lpoo.tarefa05.exercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        int conversao;
        double temperatura;


        System.out.println("Escolha a conversão desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Fahrenheit para Kelvin");
        System.out.println("6 - Kelvin para Fahrenheit");
        try {
            Scanner scanner = new Scanner(System.in);
            conversao = scanner.nextInt();
            switch (conversao){
                case 1:
                    System.out.println("Digite a temperatura em Celsius:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Fahrenheit: %.2f ºF\n", Temperatura.celsiusParaFahrenheit(temperatura));
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Celsius: %.2f ºC\n", Temperatura.fahrenheitParaCelsius(temperatura));
                    break;
                case 3:
                    System.out.println("Digite a temperatura em Celsius:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Kelvin: %.2f K\n", Temperatura.celsiusParaKelvin(temperatura));
                    break;
                case 4:
                    System.out.println("Digite a temperatura em Kelvin:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Celsius: %.2f ºC\n", Temperatura.kelvinParaCelsius(temperatura));
                    break;
                case 5:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Kelvin: %.2f K\n", Temperatura.fahrenheitParaKelvin(temperatura));
                    break;
                case 6:
                    System.out.println("Digite a temperatura em Kelvin:");
                    temperatura = scanner.nextDouble();
                    System.out.printf("Temperatura em Fahrenheit: %.2f ºF\n", Temperatura.kelvinParaFahrenheit(temperatura));
                    break;
            }
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida");
        }

    }
}
