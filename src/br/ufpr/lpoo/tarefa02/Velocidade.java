package br.ufpr.lpoo.tarefa02;

/**
 * Calcula a velocidade media de um veiculo
 * Chamada: java Velocidade <distancia> <tempo>
 *      Exemplo de uso: java Velocidade 100 2.5
 */
public class Velocidade {
    public static void main(String[] args) {
        double dist;
        double tempo;

        try {
            dist = Double.parseDouble(args[0]);
            tempo = Double.parseDouble(args[1]);

            double velocidade = dist / tempo;
            System.out.printf("Velocidade media: %.2f km/h", velocidade);
        } catch (NumberFormatException e) {
            System.out.println("Informe um numero valido. Exemplo java Velocidade 100 2.5");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Informe dois numeros. Exemplo java Velocidade 100 2.5");
        }
    }
}
