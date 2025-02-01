package br.ufpr.lpoo.tarefa06.exercicio13;

public class Trem extends VeiculoTerrestre{

    int quantidadeVagoes;
    boolean passageiros;

    public Trem(String cor, int velocidadeMaxima, String identificacao, int quantidadeRodas, int quantidadeVagoes, boolean passageiros) {
        super(cor, velocidadeMaxima, identificacao, quantidadeRodas);
        this.quantidadeVagoes = quantidadeVagoes;
        this.passageiros = passageiros;
    }

    @Override
    public void andar() {
        System.out.println("Trem andando...");
        System.out.println("       ooOOOO");
        System.out.println("     oo       _____");
        System.out.println("    _I__n_n__||__||_______");
        System.out.println("  >(_________|_7_|-|______|");
        System.out.println("  /oo      oo   o   o   oo");
        System.out.println("##################################");

    }
}
