package br.ufpr.lpoo.tarefa06.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{

    private final List<String> departamentos = new ArrayList<>();

    public Diretor(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario, departamento);
        this.departamentos.add(departamento);
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
