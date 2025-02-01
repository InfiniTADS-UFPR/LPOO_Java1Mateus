package br.ufpr.lpoo.tarefa06.exercicio14;

import br.ufpr.lpoo.tarefa06.exercicio11.Superficie;

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
