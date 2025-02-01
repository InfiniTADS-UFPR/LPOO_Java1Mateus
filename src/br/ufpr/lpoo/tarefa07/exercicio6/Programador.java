package br.ufpr.lpoo.tarefa07.exercicio6;

public class Programador extends Funcionario{

    public Programador(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario, departamento);
    }

    public Programador(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        super(nome, cargo, salario, gerente, departamento);
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.8;
    }
}
