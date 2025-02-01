package br.ufpr.lpoo.tarefa07.exercicio3;

public class Retangulo implements Superficie {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero");
        }
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return this.base*this.altura;
    }
}
