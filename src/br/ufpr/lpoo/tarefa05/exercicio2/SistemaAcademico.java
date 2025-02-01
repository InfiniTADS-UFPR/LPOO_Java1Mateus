package br.ufpr.lpoo.tarefa05.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAcademico {
    static Aluno[] alunos;
    static int quantidadeAlunos;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema acadêmico!");
        System.out.print("Informe quantos alunos você deseja cadastrar: ");
        try {
            quantidadeAlunos = scanner.nextInt();
            alunos = new Aluno[quantidadeAlunos];
            while (true){
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Excluir aluno por nome");
                System.out.println("3 - Listar alunos");
                System.out.println("4 - Matricular aluno em disciplina");
                System.out.println("5 - Cancelar matrícula");
                System.out.println("6 - Imprimir lista de alunos");
                System.out.println("7 - Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        System.out.print("Informe o nome do aluno que deseja excluir: ");
                        String nomeAluno = scanner.nextLine();
                        excluirAlunoPorNome(nomeAluno);
                        break;
                    case 3:
                        listarAlunos();
                        break;
                    case 4:
                        System.out.print("Informe o nome do aluno: ");
                        String nomeAlunoMatricula = scanner.nextLine();
                        System.out.print("Informe a disciplina: ");
                        String disciplina = scanner.nextLine();
                        for (Aluno aluno : alunos) {
                            if (aluno != null && aluno.getNome().equalsIgnoreCase(nomeAlunoMatricula)) {
                                System.out.println(matricularAlunoEmDisciplina(aluno, disciplina));
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.print("Informe o nome do aluno: ");
                        String nomeAlunoCancelamento = scanner.nextLine();
                        System.out.print("Informe a disciplina: ");
                        String disciplinaCancelamento = scanner.nextLine();
                        for (Aluno aluno : alunos) {
                            if (aluno != null && aluno.getNome().equalsIgnoreCase(nomeAlunoCancelamento)) {
                                System.out.println(cancelarMatricula(aluno, disciplinaCancelamento));
                                break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println(imprimirListaDeAlunoseDisciplinas());
                        break;
                    case 7:
                    default:
                        System.out.println("Saindo do sistema acadêmico...");
                        System.exit(0);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Valor inválido! Por favor, informe um número inteiro.");
        }
    }
    public static void cadastrarAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade do aluno: ");
        int idade = scanner.nextInt();
        System.out.print("Informe a matrícula do aluno: ");
        String matricula = scanner.next();
        System.out.print("Informe o curso do aluno: ");
        String curso = scanner.next();
        System.out.print("Informe o período do aluno: ");
        int periodo = scanner.nextInt();
        System.out.print("Informe a quantidade de disciplinas permitidas para o aluno: ");
        int quantidadeDisciplinasPermitidas = scanner.nextInt();
        Aluno aluno = new Aluno(nome, idade, matricula, curso, periodo, quantidadeDisciplinasPermitidas);
        for(int i=0; i<alunos.length; i++){
            if(alunos[i]==null){
                alunos[i] = aluno;
                return;
            }
        }
        System.out.println("Quantidade de alunos excedida!");

    }
    public static void excluirAlunoPorNome(String nomeAluno){
        int i;
        for(i=0; i<alunos.length; i++){
            if(alunos[i]!= null && alunos[i].getNome().equalsIgnoreCase(nomeAluno)){
                System.out.println("Aluno encontrado!");
                alunos[i] = null;
                System.out.println("Aluno excluído com sucesso!");
                break;
            }
        }
        for(int j=i; j<alunos.length-1; j++){
            alunos[j] = alunos[j+1];
        }
        if(i==alunos.length) {
            System.out.println("Aluno não encontrado!");
        }
    }
    public static Aluno[] listarAlunos(){
        return alunos;
    }
    public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina){
        return aluno.fazMatricula(disciplina);
    }
    public static String cancelarMatricula(Aluno aluno, String disciplina){
        return aluno.cancelarMatricula(disciplina);
    }
    public static String imprimirListaDeAlunoseDisciplinas(){
        StringBuilder listaAlunos = new StringBuilder();
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                listaAlunos.append(aluno.imprime()).append("\n");
            }
        }
        return listaAlunos.toString();
    }
}
