package br.ufpr.lpoo.tarefa05.exercicio2;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private int periodo;
    private String[] disciplinasMatriculadas;
    private int quantidadeDisciplinasPermitidas;
    private String endereco;

    public Aluno(String nome, int idade, String matricula, String curso, int periodo, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
        this.disciplinasMatriculadas = new String[this.quantidadeDisciplinasPermitidas];
    }

    public String fazMatricula(String disciplina) {
        if(this.quantidadeDisciplinasPermitidas==0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }
        for (int i = 0; i < this.quantidadeDisciplinasPermitidas; i++) {
            if (this.disciplinasMatriculadas[i] == null) {
                this.disciplinasMatriculadas[i] = disciplina;
                return "Matrícula na disciplina \""+disciplina+"\" executada.";
            }
        }
        return "Quantidade de disciplinas excedida!\nO limite de " +
                "disciplinas para este aluno é de "+ this.quantidadeDisciplinasPermitidas +
                " disciplina(s).\nSe desejar, cancele a matrícula de uma das disciplinas"+
                " e faça a nova matrícula.";
    }

    public String cancelarMatricula(String disciplina){
        for (int i = 0; i < this.quantidadeDisciplinasPermitidas; i++) {
            if (this.disciplinasMatriculadas[i] != null && this.disciplinasMatriculadas[i].equals(disciplina)) {
                this.disciplinasMatriculadas[i] = null;
                return "Cancelamento da matrícula da disciplina "+disciplina+" executado com sucesso.";
            }
        }
        return "Aluno não está matriculado na disciplina "+disciplina+", portanto não é possível cancelar esta matrícula.";
    }

    public String imprime(){
        int i;
        StringBuilder aluno = new StringBuilder();
        aluno.append("-".repeat(50)).append("\n");
        aluno.append("Nome do aluno: ").append(this.nome).append("\n");
        aluno.append("Matrícula: ").append(this.matricula).append("\n");
        aluno.append("Curso: ").append(this.curso).append("\n");
        aluno.append("Período: ").append(this.periodo).append("\n");
        aluno.append("Disciplinas matriculadas: ");
        for (i = 0; i < this.quantidadeDisciplinasPermitidas; i++) {
            if (this.disciplinasMatriculadas[i] != null) {
                aluno.append(this.disciplinasMatriculadas[i]);
                if (i < this.quantidadeDisciplinasPermitidas - 1) {
                    aluno.append("; ");
                }
            }
        }
        aluno.append("\n").append("-".repeat(50)).append("\n");
        return aluno.toString();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return imprime();
    }
}
