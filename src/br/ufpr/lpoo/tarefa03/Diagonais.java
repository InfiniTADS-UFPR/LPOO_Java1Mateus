package br.ufpr.lpoo.tarefa03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diagonais {
    public static void main(String[] args){
        int linhas, colunas, diagonalPrincipal = 0, diagonalSecundaria = 0;
        int[][] matriz;

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira as dimensões da matriz: ");
            System.out.print("Linhas: ");
            linhas = scanner.nextInt();
            System.out.print("Colunas: ");
            colunas = scanner.nextInt();

            matriz = new int[linhas][colunas];

            for (int i = 0; i < linhas; i++){
                Scanner s = new Scanner(System.in);
                for (int j = 0; j < colunas; j++){
                    try {
                        matriz[i][j] = s.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Erro: valor inserido inválido");
                        j--;
                    }
                }
            }

            for (int i = 0; i < linhas; i++){
                for (int j = 0; j < colunas; j++){
                    if (i == j){
                        diagonalPrincipal += matriz[i][j];
                    }
                    if (i + j == linhas - 1){
                        diagonalSecundaria += matriz[i][j];
                    }
                    System.out.print("| " + matriz[i][j] + " ");
                }
                System.out.println("|");
                System.out.println(new StringBuilder().insert(0, "-").toString().repeat(colunas * 4 + 1));
            }
            System.out.println("Diagonal principal: " + diagonalPrincipal);
            System.out.println("Diagonal secundária: " + diagonalSecundaria);
            System.out.println("Soma das diagonais: " + (diagonalPrincipal + diagonalSecundaria));

        }catch (InputMismatchException e){
            System.out.println("Erro: valor inserido inválido");
        }
    }
}
