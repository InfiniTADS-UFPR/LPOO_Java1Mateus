package br.ufpr.lpoo.tarefa07.exercicio6;

public class InsufficientValueException extends Exception{
    public InsufficientValueException(String message) {
        super(message);
    }

    public InsufficientValueException() {
        super("Valor insuficiente");
    }
}
