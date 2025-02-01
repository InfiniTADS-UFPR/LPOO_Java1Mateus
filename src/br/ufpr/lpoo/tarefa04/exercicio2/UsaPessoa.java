package br.ufpr.lpoo.tarefa04.exercicio2;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(20);
        pessoa.setEndereço("Rua 1, nº 1");
        pessoa.imprime();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.imprime();
    }
}