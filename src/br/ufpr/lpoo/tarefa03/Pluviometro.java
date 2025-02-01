package br.ufpr.lpoo.tarefa03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pluviometro {
    public static void main(String[] args) {
        double[] pluviometro = new double[7];
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double media = 0, max = 0, min = 0;
        int diaMax = 0, diaMin = 0;

        for (int i = 0; i < pluviometro.length; i++) {
            Scanner s = new Scanner(System.in);
            try {
                System.out.print("Digite o índice pluviométrico de " + dias[i] + ": ");
                pluviometro[i] = s.nextDouble();
                media += pluviometro[i];
                if (pluviometro[i] > max || i == 0) {
                    max = pluviometro[i];
                    diaMax = i;
                }
                if(pluviometro[i] < min || i == 0){
                    min = pluviometro[i];
                    diaMin = i;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido...");
                i--;
            }
        }
        media /= pluviometro.length;

        System.out.printf("O índice pluviométrico médio é: %.2f\n", media);
        System.out.printf("O índice pluviométrico máximo foi: %.1f de %s\n", max, dias[diaMax]);
        System.out.printf("O índice pluviométrico mínimo foi: %.1f de %s\n", min, dias[diaMin]);
    }
}
