package br.ufpr.lpoo.tarefa05.exercicio3;

public class Ponto3D {
    private double x;
    private double y;
    private double z;
    private String cor;
    private double intensidade;

    protected Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected void imprime() {
        System.out.println("Ponto3D { " +
                "x: " + x +
                ", y: " + y +
                ", z: " + z +
                ", cor: " + cor +
                ", intensidade: " + intensidade + "% }");
    }

    protected double calculaDistancia(Ponto3D outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) +
                Math.pow(this.y - outro.y, 2) +
                Math.pow(this.z - outro.z, 2));
    }

    protected double getX() {
        return x;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected double getY() {
        return y;
    }

    protected void setY(double y) {
        this.y = y;
    }

    protected double getZ() {
        return z;
    }

    protected void setZ(double z) {
        this.z = z;
    }

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected double getIntensidade() {
        return intensidade;
    }

    protected void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }
}
