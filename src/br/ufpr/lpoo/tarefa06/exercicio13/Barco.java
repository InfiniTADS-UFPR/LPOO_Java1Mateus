package br.ufpr.lpoo.tarefa06.exercicio13;

public class Barco extends VeiculoAquatico{

    boolean velas;
    boolean carga;

    public Barco(String cor, int velocidadeMaxima, String identificacao, boolean coletes, boolean velas, boolean carga) {
        super(cor, velocidadeMaxima, identificacao, coletes);
        this.velas = velas;
        this.carga = carga;
    }

    @Override
    public void andar() {
        System.out.println("Barco navegando...");
        System.out.println("                  __/___  ");
        System.out.println("            _____/______| ");
        System.out.println("    _______/_____\\_______\\_____");
        System.out.println("   \\       < < <                |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
