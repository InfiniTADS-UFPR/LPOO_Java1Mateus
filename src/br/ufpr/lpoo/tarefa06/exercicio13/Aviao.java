package br.ufpr.lpoo.tarefa06.exercicio13;

public class Aviao extends VeiculoAereo{

    int asas;
    int capacidade;

    public Aviao(String cor, int velocidadeMaxima, String identificacao, int helices, boolean caixaPreta, int asas, int capacidade) {
        super(cor, velocidadeMaxima, identificacao, helices, caixaPreta);
        this.asas = asas;
        this.capacidade = capacidade;
    }

    @Override
    public void andar() {
        System.out.println("Aviao voando...");
        System.out.println("       __|__");
        System.out.println("--o--o--(_)--o--o--");
    }
}
