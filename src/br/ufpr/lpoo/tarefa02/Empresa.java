package br.ufpr.lpoo.tarefa02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        double salario;
        String cargo;

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Informe o salario: ");
            salario = scanner.nextDouble();
            System.out.print("Informe o cargo: ");
            cargo = scanner.next();

            if(cargo.equalsIgnoreCase("Auxiliar")){
                double bonus = salario * 0.5;
                System.out.printf("Seu bonus anual é: R$ %.2f\n", bonus);

            } else if(cargo.equalsIgnoreCase("Programador")){
                double bonus = salario * 0.8;
                System.out.printf("Seu bonus anual é: R$ %.2f\n", bonus);

            } else if(cargo.equalsIgnoreCase("Analista")){
                double bonus = salario;
                System.out.printf("Seu bonus anual é: R$ %.2f\n", bonus);

            } else if(cargo.equalsIgnoreCase("Gerente")){
                System.out.print("Informe a quantidade de funcionarios gerenciados: ");
                int funcionarios = scanner.nextInt();
                double bonus = (salario * 2) + (funcionarios * 100);
                System.out.printf("Seu bonus anual é: R$ %.2f\n", bonus);

            } else if (cargo.equalsIgnoreCase("Diretor")) {
                System.out.println("Informe a quantidade de departamentos gerenciados: ");
                int departamentos = scanner.nextInt();
                double bonus = (salario * 4) + (departamentos * 3000);
                System.out.printf("Seu bonus anual é: R$ %.2f\n", bonus);

            } else {
                System.out.println("Cargo invalido.");
            }
        } catch (InputMismatchException e){
            System.out.println("Informe um salario valido.");
        }

    }
}

