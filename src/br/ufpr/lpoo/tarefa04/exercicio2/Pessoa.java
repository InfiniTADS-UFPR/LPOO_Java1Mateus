package br.ufpr.lpoo.tarefa04.exercicio2;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereço;

    public void imprime() {
        System.out.println("Pessoa { " +
                "nome: " + nome +
                ", idade: " + idade +
                " anos, endereço: " + endereço + '}');
    }

    public void fazAniversario(){
        System.out.println("Feliz aniversário, " + this.nome + "!");
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
