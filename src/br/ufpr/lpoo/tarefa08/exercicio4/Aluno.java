package br.ufpr.lpoo.tarefa08.exercicio4;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private final String matricula;
    private final String curso;
    private final int periodo;
    private final ArrayList<Disciplina> disciplinasMatriculadas;
    private final int quantidadeDisciplinasPermitidas;

    public Aluno(String nome, int idade, String endereco, String matricula, String curso, int periodo, int quantidadeDisciplinasPermitidas) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
        this.disciplinasMatriculadas = new ArrayList<>(this.quantidadeDisciplinasPermitidas);
    }

    public String fazMatricula(Disciplina disciplina) {
        if(this.quantidadeDisciplinasPermitidas==0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }
        if (this.disciplinasMatriculadas.size() < this.quantidadeDisciplinasPermitidas){
            this.disciplinasMatriculadas.add(disciplina);
            return "Matrícula na disciplina \""+disciplina+"\" executada.";
        } else {
            return "Quantidade de disciplinas excedida!\nO limite de " +
                    "disciplinas para este aluno é de " + this.quantidadeDisciplinasPermitidas +
                    " disciplina(s).\nSe desejar, cancele a matrícula de uma das disciplinas" +
                    " e faça a nova matrícula.";
        }
    }

    public String cancelarMatricula(Disciplina disciplina){
        if(this.disciplinasMatriculadas.remove(disciplina)){
            return "Cancelamento da matrícula da disciplina "+disciplina+" executado com sucesso.";
        } else{
            return "br.ufpr.exercicio4.Aluno não está matriculado na disciplina "+disciplina+", portanto não é possível cancelar esta matrícula.";
        }
    }

    public String imprime(){
        StringBuilder aluno = new StringBuilder();
        aluno.append("-".repeat(50)).append("\n");
        aluno.append("Nome do aluno: ").append(this.getNome()).append("\n");
        aluno.append("Matrícula: ").append(this.matricula).append("\n");
        aluno.append("Curso: ").append(this.curso).append("\n");
        aluno.append("Período: ").append(this.periodo).append("\n");
        aluno.append("Disciplinas matriculadas: ");
        aluno.append(this.disciplinasMatriculadas);
        aluno.append("\n").append("-".repeat(50));
        return aluno.toString();
    }

    @Override
    public String toString() {
        return imprime();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public ArrayList<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public int getQuantidadeDisciplinasPermitidas() {
        return quantidadeDisciplinasPermitidas;
    }
}
