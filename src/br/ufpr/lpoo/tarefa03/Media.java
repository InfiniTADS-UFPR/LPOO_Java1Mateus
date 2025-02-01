package br.ufpr.lpoo.tarefa03;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int vezes = 0;
        String entrada = "";
        double media = 0;
        while(!entrada.equalsIgnoreCase("s")){
            System.out.println("Digite um valor numérico ou 's' para sair");
            Scanner s = new Scanner(System.in);
            try {
                entrada = s.next();
                media += Double.parseDouble(entrada);
                vezes++;
            } catch (NumberFormatException e) {
                System.out.println("Digite um argumento válido...");
            }
        }

        System.out.printf("Soma: %.1f; Números: %d\n", media, vezes);
        System.out.printf("Média: %.1f\n", (media / vezes));
        System.out.print("\n");
    }
}
