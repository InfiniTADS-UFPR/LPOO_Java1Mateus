package br.ufpr.lpoo.tarefa06.exercicio13;

public abstract class Veiculo {

    private String cor;
    private int velocidadeMaxima;
    private final String identificacao;

    public Veiculo(String cor, int velocidadeMaxima, String identificacao) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.identificacao = identificacao;
    }

    public abstract void andar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getIdentificacao() {
        return identificacao;
    }
}
