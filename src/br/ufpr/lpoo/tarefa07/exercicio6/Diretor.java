package br.ufpr.lpoo.tarefa07.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{

    private final List<String> departamentos;

    public Diretor(String nome, String cargo, double salario, String departamento, ArrayList<String> departamentos) throws InsufficientValueException {
        super(nome, cargo, salario, departamento);
        this.departamentos = departamentos;
        if (departamentos.size() < 2) {
            throw new InsufficientValueException("Um diretor deve ter no mínimo 2 departamentos.");
        }
    }

    public List<String> getDepartamentos() {
        return departamentos;
    }

    @Override
    public double getBonus() {
        return (this.getSalario()*4)+(3000*this.getDepartamentos().size());
    }

    @Override
    public String toString() {
        return "| "+getNome() + " | \"" +getCargo() + "\" | " + String.format("R$%.2f", getSalario()) +" | "+ getDepartamentos() + " | "+ getBonus() +" |";
    }
}
