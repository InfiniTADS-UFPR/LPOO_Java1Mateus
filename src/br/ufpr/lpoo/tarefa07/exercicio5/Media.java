package br.ufpr.lpoo.tarefa07.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double media = 0;
        ArrayList<Double> numero = new ArrayList<>();

        System.out.println("Calculadora de média!");
        while(true) {
            Scanner s = new Scanner(System.in);
            try {
                System.out.print("Digite um número ou 'S' para sair: ");
                String entrada = s.next();
                if (entrada.equalsIgnoreCase("S")) {
                    break;
                }

                double valor = Double.parseDouble(entrada);
                numero.add(valor);
                media += valor;

            } catch (Exception e) {
                System.out.println("Digite um argumento válido....");
            }
        }

        System.out.printf("Média: %.1f\n", (media / numero.size()));
        System.out.printf("Numeros digitados:\n%s", numero);
        
        System.out.print("\n");
    }
}
