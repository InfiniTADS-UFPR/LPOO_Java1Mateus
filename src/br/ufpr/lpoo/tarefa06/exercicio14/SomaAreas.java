package br.ufpr.lpoo.tarefa06.exercicio14;

import br.ufpr.lpoo.tarefa06.exercicio11.Circunferencia;
import br.ufpr.lpoo.tarefa06.exercicio11.Superficie;

public class SomaAreas {
    public static void main(String[] args) {
        Superficie[] superficies = new Superficie[3];
        superficies[0] = new Circunferencia(5);
        superficies[1] = new Triangulo(2, 3);
        superficies[2] = new Retangulo(2, 3);

        System.out.printf("Soma total: %.2f cm²\n", somaAreas(superficies));
    }

    public static double somaAreas(Superficie[] superficies) {
        double soma = 0;
        for (Superficie superficie : superficies) {
            System.out.println("Superficie do tipo: " + superficie.getClass().getSimpleName()+ ", área = " + superficie.calculaArea() + " cm²");
            soma += superficie.calculaArea();
        }
        return soma;
    }
}
