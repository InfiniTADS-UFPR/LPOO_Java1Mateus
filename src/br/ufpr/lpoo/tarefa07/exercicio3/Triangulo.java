package br.ufpr.lpoo.tarefa07.exercicio3;

public class Triangulo implements Superficie {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return (this.base*this.altura)/2;
    }
}
