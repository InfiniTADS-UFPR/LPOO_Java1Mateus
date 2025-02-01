package br.ufpr.lpoo.tarefa07.exercicio6;

public class Analista extends Funcionario{

    public Analista(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario, departamento);
    }

    public Analista(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        super(nome, cargo, salario, gerente, departamento);
    }

    @Override
    public double getBonus() {
        return this.getSalario();
    }
}
