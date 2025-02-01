package br.ufpr.lpoo.tarefa05.exercicio3;

public class UsaPonto3D {
    public static void main(String[] args) {
        Ponto3D ponto = new Ponto3D(1, 2, 3);
        ponto.setCor("Azul");
        ponto.setIntensidade(100);
        ponto.imprime();
        Ponto3D outroPonto = new Ponto3D(4, 5, 6);
        outroPonto.setCor("Vermelho");
        outroPonto.imprime();
        System.out.printf("Distância entre os pontos: %.4f\n", ponto.calculaDistancia(outroPonto));
    }
}
