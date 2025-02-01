package br.ufpr.lpoo.tarefa06.exercicio13;

public abstract class VeiculoAereo extends Veiculo{

    int helices;
    boolean caixaPreta;

    public VeiculoAereo(String cor, int velocidadeMaxima, String identificacao, int helices, boolean caixaPreta) {
        super(cor, velocidadeMaxima, identificacao);
        this.helices = helices;
        this.caixaPreta = caixaPreta;
    }
}
