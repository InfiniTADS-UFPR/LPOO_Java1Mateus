package br.ufpr.lpoo.tarefa06.exercicio3;

public class Auxiliar extends Funcionario{

    public Auxiliar(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        super(nome, cargo, salario, gerente, departamento);
    }

    @Override
    public double getBonus() {
        return this.getSalario()*0.5;
    }
}
