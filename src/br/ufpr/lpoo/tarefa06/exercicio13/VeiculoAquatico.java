package br.ufpr.lpoo.tarefa06.exercicio13;

public abstract class VeiculoAquatico extends Veiculo{

    boolean coletes;

    public VeiculoAquatico(String cor, int velocidadeMaxima, String identificacao, boolean coletes) {
        super(cor, velocidadeMaxima, identificacao);
        this.coletes = coletes;
    }
}
