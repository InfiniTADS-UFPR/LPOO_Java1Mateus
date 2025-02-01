package br.ufpr.lpoo.tarefa01;

public class Nome {
    public static void main(String[] args) {
        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }
        if (args.length == 0) {
            System.out.println("Informe seu nome. Exemplo: java Nome Fulano de Tal");
        }
    }
}