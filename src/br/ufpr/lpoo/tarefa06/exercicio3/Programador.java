package br.ufpr.lpoo.tarefa06.exercicio3;

public class Programador extends Funcionario{

    public Programador(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        super(nome, cargo, salario, gerente, departamento);
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.8;
    }
}
