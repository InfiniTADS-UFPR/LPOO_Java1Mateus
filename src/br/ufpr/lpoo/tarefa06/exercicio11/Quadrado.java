package br.ufpr.lpoo.tarefa06.exercicio11;

public class Quadrado implements Superficie{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return Math.pow(this.lado, 2);
    }

    public double calculaPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public String toString() {
        return String.format("Quadrado -> lado: %.1f cm, área: %.2f cm², perímetro: %.2f cm",
                this.lado, this.calculaArea(), this.calculaPerimetro());
    }
}
