package br.ufpr.lpoo.tarefa07.exercicio6;

public abstract class Funcionario{
    private String nome;
    private String cargo;
    private double salario;
    private Gerente gerente;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Funcionario(String nome, String cargo, double salario, Gerente gerente, String departamento) {
        this.nome = nome;
        this.cargo=cargo;
        this.salario=salario;
        this.gerente=gerente;
        gerente.getEquipe().add(this);
        this.departamento=departamento;
    }

    public abstract double getBonus();

    @Override
    public String toString() {
        return "| "+getNome() + " | \"" +getCargo() + "\" | " + String.format("R$%.2f", getSalario()) + " | "+ getGerente().getNome() + " | "+ getDepartamento() +" | "+ getBonus() +" |";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
