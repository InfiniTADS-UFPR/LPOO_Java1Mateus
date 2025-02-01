package br.ufpr.lpoo.tarefa01;

public class Calculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Informe 3 argumentos. Exemplo: java Calculadora 1 + 2");
            return;
        }
        try{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double result = 0;

            switch (args[2]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "x":
                case "X": // "x" ou "X"
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Operacao invalida. Use +, -, x ou /");
                    return;
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Informe numeros. Exemplo: java Calculadora 1 + 2");
        }
    }
}
