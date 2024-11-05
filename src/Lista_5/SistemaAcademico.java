/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class SistemaAcademico {
    public static void main(String[] args){
        int numeroAlunos;
        System.out.println("Digie o número de alunos a serem instanciados: ");
        Scanner scan = new Scanner(System.in);
        numeroAlunos = scan.nextInt();
        
        Aluno[] vetor = new Aluno[numeroAlunos];
        
        while(true){
            System.out.println("1 - Cadastrar Aluno\n2 - Excluir Aluno por nome \n3 - Listar alunos\n4 - Matricular aluno em disciplina"+
                    "\n5 - Cancelar matrícula\n6 - Imprimir lista Alunos e Disciplinas Matriculadas");
            Scanner scan1 = new Scanner(System.in);
            int opcao = scan1.nextInt();
            switch (opcao){
                case 1:
                    cadastrarAluno(vetor);
                    break;
                case 2:
                    excluirAlunoPorNome(vetor);
                    break;
                case 3:
                    System.out.println(listarAlunos(vetor));
                    break;
                case 4:
                    System.out.println(matricularAlunoEmDisciplina(vetor));
                    break;
                case 5:
                    System.out.println(cancelarMatricula(vetor));
                    break;
                case 6:
                    System.out.println(imprimirListaDeAkunoseDisciplinas(vetor));
                    break;
                case 7:
                    System.out.println("Adé logo!");
                    System.exit(0);
            }
        }
    }
    
    public static void cadastrarAluno(Aluno[] vetor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.println("Digite o curso do aluno ");
        String curso = scanner.nextLine();
        System.out.println("Digite o periodo do aluno: ");
        int perido = scanner.nextInt();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        System.out.println("Digite a quantidade de desciplinas permitidas: ");
        int quantidadeDisciplinasPermitidas = scanner.nextInt();
        Aluno a = new Aluno(nome,matricula,curso,perido,idade,quantidadeDisciplinasPermitidas);
        for (int i=0;i<vetor.length;i++){
            if (vetor[i]==null){
                vetor[i] = a;
                break;
            }
        }
    }
    
    public static void excluirAlunoPorNome(Aluno[] vetor){
        System.out.println("Digito o nome do aluno a ser removido:");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        for (int i=0;i<vetor.length;i++){
            if (vetor[i].getNome().equals(nome)){
                vetor[i] = null;
                break;
            }
            if (i == vetor.length){
                System.out.println("Aluno não cadastrado.");
            }
        }
    }

    public static String listarAlunos(Aluno[] vetor) {
        String saida = "";
        for (Aluno a : vetor){
            saida += a.getNome()+"\n";
        }
        return saida;
    }
    
    public static String matricularAlunoEmDisciplina(Aluno[] vetor){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno a ser matriculado:");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome da discuplina:");
        String disciplina = scanner.nextLine();
        for(i=0;i<vetor.length;i++){
            if (vetor[i].getNome().equals(nome)){
                break;
            }
        }
        if (i==vetor.length)
            return "Aluno não encontrado";
        return vetor[i].fazMatricula(disciplina);
    }

    private static String cancelarMatricula(Aluno[] vetor) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno a ser desmatriculado:");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome da discuplina:");
        String disciplina = scanner.nextLine();
        for(i=0;i<vetor.length;i++){
            if (vetor[i].getNome().equals(nome)){
                break;
            }
        }
        return vetor[i].cancelarMatriculas(disciplina);
    }

    private static String imprimirListaDeAkunoseDisciplinas(Aluno[] vetor) {
        String saida ="";
        for (Aluno a : vetor){
            saida += a.imprime()+"\n";
        }
        return saida;
    }
    
}
