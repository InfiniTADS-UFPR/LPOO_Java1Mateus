package br.ufpr.lpoo.tarefa06.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario{
    private final List<Funcionario> equipe = new ArrayList<>();

    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome,cargo,salario, departamento);
    }

    @Override
    public double getBonus() {
        return (this.getSalario()*2)+(100*this.getEquipe().size());
    }

    public List<Funcionario> getEquipe() {
        return equipe;
    }

    public List<String> getEquipeList() {
        List<String> nomes = new ArrayList<>();
        for(Funcionario f:equipe){
            nomes.add(f.getNome());
        }
        return nomes;
    }

    @Override
    public String toString() {
        return "| "+getNome() + " | \"" +getCargo() + "\" | " + String.format("R$%.2f", getSalario()) + " | "+ this.getEquipeList() + " | "+ this.getDepartamento() +" | "+ getBonus() +" |";
    }
    
}
