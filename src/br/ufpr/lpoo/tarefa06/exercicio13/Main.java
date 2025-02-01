package br.ufpr.lpoo.tarefa06.exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos veículos deseja cadastrar?");
        int n = scanner.nextInt();
        for(int i =0; i<n; i++){
            System.out.println("Qual o tipo do veículo? (1 - Carro, 2 - Avião, 3 - Trem, 4 - Barco)");
            int tipo = scanner.nextInt();
            System.out.println("Qual a cor do veículo?");
            String cor = scanner.next();
            System.out.println("Qual a velocidade máxima do veículo?");
            int velocidadeMaxima = scanner.nextInt();
            System.out.println("Qual a identificação do veículo?");
            String identificacao = scanner.next();
            switch(tipo) {
                case 1:
                    System.out.println("Quantas portas o carro tem?");
                    int quantidadePortas = scanner.nextInt();
                    System.out.println("Qual a marca do carro?");
                    String marca = scanner.next();
                    System.out.println("Qual o modelo do carro?");
                    String modelo = scanner.next();
                    veiculos.add(new Carro(cor, velocidadeMaxima, identificacao, 4, quantidadePortas, marca, modelo));
                    break;
                case 2:
                    System.out.println("Quantas hélices o avião tem?");
                    int helices = scanner.nextInt();
                    System.out.println("A caixa preta está presente? (1 - Sim, 0 - Não)");
                    boolean caixaPreta = scanner.nextInt() == 1;
                    System.out.println("Quantas asas o avião tem?");
                    int asas = scanner.nextInt();
                    System.out.println("Qual a capacidade do avião?");
                    int capacidade = scanner.nextInt();
                    veiculos.add(new Aviao(cor, velocidadeMaxima, identificacao, helices, caixaPreta, asas, capacidade));
                    break;
                case 3:
                    System.out.println("Quantos vagões o trem tem?");
                    int quantidadeVagoes = scanner.nextInt();
                    System.out.println("Há passageiros no trem? (1 - Sim, 0 - Não)");
                    boolean passageiros = scanner.nextInt() == 1;
                    veiculos.add(new Trem(cor, velocidadeMaxima, identificacao, 4, quantidadeVagoes, passageiros));
                    break;
                case 4:
                    System.out.println("Há coletes salva-vidas no barco? (1 - Sim, 0 - Não)");
                    boolean coletes = scanner.nextInt() == 1;
                    System.out.println("O barco tem velas? (1 - Sim, 0 - Não)");
                    boolean velas = scanner.nextInt() == 1;
                    System.out.println("O barco tem carga? (1 - Sim, 0 - Não)");
                    boolean carga = scanner.nextInt() == 1;
                    veiculos.add(new Barco(cor, velocidadeMaxima, identificacao, coletes, velas, carga));
                    break;
            }
        }
        System.out.println("Veículos cadastrados!");
        System.out.println("Inicializando...");
        for(Veiculo veiculo : veiculos){
            veiculo.andar();
            System.out.println();
        }
    }

}
