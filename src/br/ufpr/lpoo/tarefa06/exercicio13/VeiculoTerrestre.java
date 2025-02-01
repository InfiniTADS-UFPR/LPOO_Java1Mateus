package br.ufpr.lpoo.tarefa06.exercicio13;

public abstract class VeiculoTerrestre extends Veiculo{

    int quantidadeRodas;

    public VeiculoTerrestre(String cor, int velocidadeMaxima, String identificacao, int quantidadeRodas) {
        super(cor, velocidadeMaxima, identificacao);
        this.quantidadeRodas = quantidadeRodas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
}
