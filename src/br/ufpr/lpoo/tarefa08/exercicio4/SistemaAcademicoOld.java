package br.ufpr.lpoo.tarefa08.exercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAcademicoOld {
    static ArrayList<Aluno> alunos;
    static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    static ArrayList<Professor> professores = new ArrayList<>();
    static int quantidadeAlunos;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema acadêmico!");
        System.out.print("Informe quantos alunos você deseja cadastrar: ");
        try {
            quantidadeAlunos = scanner.nextInt();
            alunos = new ArrayList<>(quantidadeAlunos);
            while (true){
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Excluir aluno por nome");
                System.out.println("3 - Listar alunos");
                System.out.println("4 - Matricular aluno em disciplina");
                System.out.println("5 - Cancelar matrícula");
                System.out.println("6 - Imprimir lista de alunos");
                System.out.println("7 - Cadastrar professor");
                System.out.println("8 - Cadastrar disciplina");
                System.out.println("9 - Listar professores");
                System.out.println("10 - Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                Aluno aluno;
                Disciplina disciplina;
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
                        String disc = scanner.nextLine();
                        aluno = buscarAlunoPorNome(nomeAlunoMatricula);
                        disciplina = buscarDisciplinaPorNome(disc);
                        System.out.println(matricularAlunoEmDisciplina(aluno, disciplina));
                        break;
                    case 5:
                        System.out.print("Informe o nome do aluno: ");
                        String nomeAlunoCancelamento = scanner.nextLine();
                        System.out.print("Informe a disciplina: ");
                        String disciplinaCancelamento = scanner.nextLine();
                        aluno = buscarAlunoPorNome(nomeAlunoCancelamento);
                        disciplina = buscarDisciplinaPorNome(disciplinaCancelamento);
                        System.out.println(cancelarMatricula(aluno, disciplina));
                        break;
                    case 6:
                        System.out.println(imprimirListaDeAlunoseDisciplinas());
                        break;
                    case 7:
                        cadastrarProfessor();
                        break;
                    case 8:
                        cadastrarDisciplina();
                        break;
                    case 9:
                        listarProfessores();
                        break;
                    case 10:
                    default:
                        System.out.println("Saindo do sistema acadêmico...");
                        System.exit(0);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Valor inválido! Por favor, informe um número inteiro.");
        }
    }
    public static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade do aluno: ");
        int idade = scanner.nextInt();
        System.out.print("Informe o endereço do aluno: ");
        String endereco = scanner.next();
        System.out.print("Informe a matrícula do aluno: ");
        String matricula = scanner.next();
        System.out.print("Informe o curso do aluno: ");
        String curso = scanner.next();
        System.out.print("Informe o período do aluno: ");
        int periodo = scanner.nextInt();
        System.out.print("Informe a quantidade de disciplinas permitidas para o aluno: ");
        int quantidadeDisciplinasPermitidas = scanner.nextInt();
        if (alunos.size() < quantidadeAlunos) {
            Aluno aluno = new Aluno(nome, idade, endereco, matricula, curso,  periodo, quantidadeDisciplinasPermitidas);
            alunos.add(aluno);
            System.out.println("br.ufpr.exercicio4.Aluno cadastrado com sucesso!");
        } else{
            System.out.println("Quantidade de alunos excedida!");
        }
    }

    public static void cadastrarProfessor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o título do professor (abreviação): ");
        String titulo = scanner.nextLine();
        System.out.print("Informe a idade do professor: ");
        int idade = scanner.nextInt();
        System.out.print("Informe o endereço do professor: ");
        String endereco = scanner.next();
        Professor professor = new Professor(nome, idade, endereco, titulo);
        professores.add(professor);
        System.out.println("br.ufpr.exercicio4.Professor cadastrado com sucesso!");
    }

    public static Aluno buscarAlunoPorNome(String nomeAluno){
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                return aluno;
            }
        }
        return null;
    }

    public static Professor buscarProfessorPorNome(String nomeProfessor){
        for(Professor prof : professores){
            if(prof != null && prof.getNome().equalsIgnoreCase(nomeProfessor)){
                return prof;
            }
        }
        return null;
    }

    public static Disciplina buscarDisciplinaPorNome(String disciplina){
        for(Disciplina disc : disciplinas){
            if(disc != null && disc.getNome().equalsIgnoreCase(disciplina)){
                return disc;
            }
        }
        return null;
    }

    public static void cadastrarDisciplina(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o professor da disciplina: ");
        String prof = scanner.nextLine();
        System.out.print("Informe a carga horária da disciplina: ");
        int cargaHoraria = scanner.nextInt();
        Professor professor = buscarProfessorPorNome(prof);
        if(professor != null){
            Disciplina disciplina = new Disciplina(nome, professor, cargaHoraria);
            disciplinas.add(disciplina);
            System.out.println("br.ufpr.exercicio4.Disciplina cadastrada com sucesso!");
        } else {
            System.out.println("br.ufpr.exercicio4.Professor não encontrado!");
        }
    }

    public static void excluirAlunoPorNome(String nomeAluno){
        if (alunos.remove(buscarAlunoPorNome(nomeAluno))) {
            System.out.println("br.ufpr.exercicio4.Aluno excluído com sucesso!");
        } else {
            System.out.println("br.ufpr.exercicio4.Aluno não encontrado!");
        }
    }
    public static ArrayList<Aluno> listarAlunos(){
        return alunos;
    }
    public static String matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina){
        if (aluno == null) {
            return "br.ufpr.exercicio4.Aluno não encontrado!";
        }
        if (disciplina == null){
            return "br.ufpr.exercicio4.Disciplina não encontrada!";
        }
        return aluno.fazMatricula(disciplina);
    }
    public static String cancelarMatricula(Aluno aluno, Disciplina disciplina){
        if (aluno == null) {
            return "br.ufpr.exercicio4.Aluno não encontrado!";
        }
        if(disciplina == null){
            return "br.ufpr.exercicio4.Disciplina não encontrada!";
        }
        return aluno.cancelarMatricula(disciplina);
    }
    public static String imprimirListaDeAlunoseDisciplinas(){
        StringBuilder listaAlunos = new StringBuilder();
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                listaAlunos.append(aluno).append("\n");
            }
        }
        return listaAlunos.toString();
    }

    public static void listarProfessores(){
        for(Professor prof : professores){
            System.out.println(prof);
        }
    }
}
