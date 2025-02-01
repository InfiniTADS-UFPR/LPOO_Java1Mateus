package br.ufpr.lpoo.tarefa04.exercicio3;

public class Ponto3D {
    private double x;
    private double y;
    private double z;
    private String cor;
    private double intensidade;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void imprime() {
        System.out.println("Ponto3D { " +
                "x: " + x +
                ", y: " + y +
                ", z: " + z +
                ", cor: " + cor +
                ", intensidade: " + intensidade + "% }");
    }

    public double calculaDistancia(Ponto3D outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) +
                Math.pow(this.y - outro.y, 2) +
                Math.pow(this.z - outro.z, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }
}
