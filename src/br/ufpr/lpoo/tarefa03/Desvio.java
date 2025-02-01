package br.ufpr.lpoo.tarefa03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desvio {
    public static void main(String[] args){
        double[] amostra;
        double media = 0, desvioPadrao = 0;

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira o tamanho da amostra: ");
            int tamanho = scanner.nextInt();
            amostra = new double[tamanho];

            for (int i = 0; i < tamanho; i++) {
                Scanner s = new Scanner(System.in);
                try {
                    System.out.print("Insira o valor " + (i + 1) + ": ");
                    amostra[i] = s.nextDouble();
                    media += amostra[i];
                } catch (InputMismatchException e) {
                    System.out.println("Erro: valor inserido inválido");
                    i--;
                }
            }
            media /= tamanho;
            for (int i = 0; i < tamanho; i++) {
                desvioPadrao += Math.pow(amostra[i] - media, 2);
            }
            desvioPadrao = Math.sqrt(desvioPadrao / (tamanho-1));
            System.out.printf("Desvio padrão da amostra: %.4f\n", desvioPadrao);

        }catch (InputMismatchException e){
            System.out.println("Erro: valor inserido inválido");
        }
    }
}
