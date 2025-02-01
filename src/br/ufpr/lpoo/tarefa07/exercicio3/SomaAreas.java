package br.ufpr.lpoo.tarefa07.exercicio3;

public class SomaAreas {
    public static void main(String[] args) {
        try{
            Superficie[] superficies = new Superficie[4];
            superficies[0] = new Circunferencia(5);
            superficies[1] = new Triangulo(2, 3);
            superficies[2] = new Retangulo(2, 3);
            superficies[3] = new Retangulo(-1,2);

            System.out.printf("Soma total: %.2f cm²\n", somaAreas(superficies));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

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
