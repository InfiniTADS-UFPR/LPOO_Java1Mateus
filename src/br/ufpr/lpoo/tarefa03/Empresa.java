package br.ufpr.lpoo.tarefa03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        int qtdFuncionarios, contador = 0;
        double somaSalarios = 0, mediaSalarial;
        String[] nomes;
        double[] salarios;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Informe quantos funcionários existem na empresa: ");
                qtdFuncionarios = scanner.nextInt();
                nomes = new String[qtdFuncionarios];
                salarios = new double[qtdFuncionarios];
                break;
            }catch (InputMismatchException e){
                System.out.println("Quantidade inválida. Informe novamente.");
            }
        }

        for (int i = 0; i < qtdFuncionarios; i++) {
            Scanner s = new Scanner(System.in);
            try {
                System.out.print("Informe o nome do funcionário: ");
                nomes[i] = s.next();
                if (nomes[i].length() < 3) {
                    throw new InputMismatchException("O nome deve ter pelo menos 3 caracteres. Informe novamente.");
                }
                System.out.println("Informe o salário do funcionário " + nomes[i] + ": ");
                salarios[i] = s.nextDouble();
                somaSalarios += salarios[i];
            }catch (InputMismatchException e){
                System.out.println(e.getMessage() == null ? "Salário inválido. Informe novamente." : e.getMessage());
                i--;
            }
        }

        mediaSalarial = somaSalarios / qtdFuncionarios;

        System.out.printf("Média salarial da empresa: R$%.2f\n", mediaSalarial);

        System.out.println("Funcionários com salário acima da média: ");
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (salarios[i] > mediaSalarial) {
                System.out.printf("%s - R$%.2f\n", nomes[i], salarios[i]);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Nenhum funcionário com salário acima da média.");
        }
    }
}
