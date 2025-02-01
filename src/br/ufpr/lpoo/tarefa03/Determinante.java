package br.ufpr.lpoo.tarefa03;

import java.util.Scanner;

public class Determinante {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int determinante;

        System.out.println("Informe os valores da matriz 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                Scanner s = new Scanner(System.in);
                try {
                    System.out.printf("Informe o valor da posição [%d][%d]: ", i, j);
                    matriz[i][j] = s.nextInt();
                }catch (Exception e){
                    System.out.println("Valor inválido. Informe novamente.");
                    j--;
                }
            }
        }

        determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2]) +
                       (matriz[0][1] * matriz[1][2] * matriz[2][0]) +
                       (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                       (matriz[0][2] * matriz[1][1] * matriz[2][0]) -
                       (matriz[0][0] * matriz[1][2] * matriz[2][1]) -
                       (matriz[0][1] * matriz[1][0] * matriz[2][2]);

        System.out.printf("Determinante da matriz: %d\n", determinante);
    }
}
