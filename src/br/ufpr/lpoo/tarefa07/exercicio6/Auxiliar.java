package br.ufpr.lpoo.tarefa07.exercicio6;

public class Auxiliar extends Funcionario{

    public Auxiliar(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario, departamento);
    }

    public Auxiliar(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        super(nome, cargo, salario, gerente, departamento);
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.5;
    }
}
