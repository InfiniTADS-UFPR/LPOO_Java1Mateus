package br.ufpr.lpoo.tarefa05.exercicio4;

class Bicicleta {
    private double velocidade;
    private final int totalMarchas;
    private int marcha = 1;

    public Bicicleta(){
        this.velocidade = 0.0;
        this.totalMarchas = 18;
    }
    public Bicicleta(int totalMarchas){
        this.velocidade = 0.0;
        this.totalMarchas = totalMarchas;
    }
    public void mudarMarcha(int novoValor){
        if(novoValor < 1 || novoValor > totalMarchas){
            System.out.println("Marcha inválida");
            return;
        }
        marcha = novoValor;
    }
    public void pedalar(int pedalada, double forca){
        velocidade = velocidade + pedalada*forca;
    }
    public void frear(double forca){
        velocidade = velocidade - forca*velocidade;
    }
    public String imprimeEstado(){
        return "Velocidade: "+velocidade+
            ", Marcha: "+marcha+
            ", Total de marchas: "+totalMarchas;
    }
}
