package br.ufpr.lpoo.tarefa07.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario{
    private final List<Funcionario> equipe;

    public Gerente(String nome, String cargo, double salario, String departamento, ArrayList<Funcionario> equipe) throws InsufficientValueException {
        super(nome,cargo,salario,departamento);
        this.equipe = equipe;
        if(equipe.size()<5){
            throw new InsufficientValueException("A equipe de um gerente deve ter no mínimo 5 funcionários.");
        }
        for (Funcionario f:equipe){
            f.setGerente(this);
        }
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
