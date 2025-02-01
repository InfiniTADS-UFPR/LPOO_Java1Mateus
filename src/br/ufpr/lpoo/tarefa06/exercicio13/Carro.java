package br.ufpr.lpoo.tarefa06.exercicio13;

public class Carro extends VeiculoTerrestre{

    int quantidadePortas;
    String marca;
    String modelo;

    public Carro(String cor, int velocidadeMaxima, String identificacao, int quantidadeRodas, int quantidadePortas, String marca, String modelo) {
        super(cor, velocidadeMaxima, identificacao, quantidadeRodas);
        this.quantidadePortas = quantidadePortas;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void andar() {
        System.out.println("Carro andando...");
        System.out.println("       ,-----,");
        System.out.println("   ,--'---:---`----,");
        System.out.println("   ==(o)------(o)==J");
        System.out.println("`````````````````````````");
    }
}
