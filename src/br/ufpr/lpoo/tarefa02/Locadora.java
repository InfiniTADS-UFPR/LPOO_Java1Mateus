package br.ufpr.lpoo.tarefa02;

/**
 * Classe principal que contém o método main.
 * Chamada java Locadora quantidade de DVDs valor do aluguel
 *     Exemplo de uso: java Locadora 50 5.0
 */
public class Locadora {
    public static void main(String[] args) {
        int qtdDvds;
        double valor;

        try {
            qtdDvds = Integer.parseInt(args[0]);
            valor = Double.parseDouble(args[1]);
            faturamentoAnual((qtdDvds / 3.0), valor);
            valorComMultas((qtdDvds / 10.0), valor);
        } catch (NumberFormatException e) {
            System.out.println("Informe um numero valido. Exemplo java Locadora 50 5.0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Informe dois numeros. Exemplo java Locadora 50 5.0");
        }
    }

    /**
     * Calcula o faturamento anual de uma locadora de DVDs e imprime na tela.
     * @param qtdDvds quantidade de DVDs alugados por mes
     * @param valor valor do aluguel de cada DVD
     */
    public static void faturamentoAnual(double qtdDvds, double valor) {
        double faturamento = qtdDvds * valor * 12;
        System.out.printf("Faturamento anual: R$ %.2f\n", faturamento);
    }

    /**
     * Calcula o valor ganho com multas de uma locadora de DVDs e imprime na tela.
     * @param qtdDvds quantidade de DVDs devolvidos com atraso por mes
     * @param valor valor do aluguel de cada DVD
     */
    public static void valorComMultas(double qtdDvds, double valor) {
        double multa = valor * 0.1;
        double multas = qtdDvds * multa * 12;
        System.out.printf("Valor ganho com multas: R$ %.2f\n", multas);
    }
}
