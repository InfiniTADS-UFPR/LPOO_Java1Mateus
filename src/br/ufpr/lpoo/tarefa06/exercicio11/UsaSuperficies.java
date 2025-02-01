package br.ufpr.lpoo.tarefa06.exercicio11;

public class UsaSuperficies {
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(5);
        System.out.println(circunferencia);
        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado);
        Superficie q1 = quadrado;
        Superficie c1 = circunferencia;
        System.out.println("Superfície q1: " + String.format("%.2f", q1.calculaArea()));
        System.out.println("Superfície c1: " + String.format("%.2f", c1.calculaArea()));
    }
}
