/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

/**
 *
 * @author mateus
 */
public class Aluno {
    private String nome, matricula, curso, endereço;
    private int periodo, idade, quantidadeDisciplinasPermitidas, total=0;
    private String[] discplinasMatriculadas;
    
    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
        this.discplinasMatriculadas = new String[quantidadeDisciplinasPermitidas];
    }
    
    String fazMatricula(String disciplina){
        String saida ="";
        if (this.quantidadeDisciplinasPermitidas == 0){
            saida +="Este aluno não pode ser matriculado em nenhuma disciĺina, por favot, fale com a secretaria.";
        }else if (total >= quantidadeDisciplinasPermitidas){
            saida +="Quantidade de Disciplinas excedida. O limite de disciplinas para este aluno é de "+quantidadeDisciplinasPermitidas+
                    " disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça  a nova matrícula.";
        }else {
            this.discplinasMatriculadas[total] = disciplina;
            total++;
            saida += "Matrícula na disciplina \""+disciplina+"\" executada.";
        }
        return saida;
    }
    
    String cancelarMatriculas(String disciplina){
        for(int i=0;i<this.quantidadeDisciplinasPermitidas;i++){
            if (disciplina.equals(this.discplinasMatriculadas[i])){
                for (int j=i;j<this.quantidadeDisciplinasPermitidas-1;j++){
                    this.discplinasMatriculadas[j] = this.discplinasMatriculadas[j+1];
                }
                this.discplinasMatriculadas[this.discplinasMatriculadas.length-1] = null;
                return "Cancelamento da matrícula da disciplina "+disciplina+" executado com sucessso";
            }
        }        
        return "Aluno não está matriculado na disciplina "+disciplina+", portanto não é possível cancelar esta matrícula.";
    }
    
    
    String imprime(){
        String nomes = "";
        for (int i = 0;i<this.discplinasMatriculadas.length;i++)
            nomes += this.discplinasMatriculadas[i]+";";
        String codigo = "-----------------------\n"+
                "Nome do aluno: "+this.nome+
                "\nMatricula: "+this.matricula+
                "\nCurso: "+this.curso+
                "\nPeriodo: "+this.periodo+
                "\nDiscuplinas cursadas: "+ nomes+
                "\n---------------------------\n";
        
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeDisciplinasPermitidas() {
        return quantidadeDisciplinasPermitidas;
    }

    public void setQuantidadeDisciplinasPermitidas(int quantidadeDisciplinasPermitidas) {
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
    }

    public String[] getDiscplinasMatriculadas() {
        return discplinasMatriculadas;
    }

    public void setDiscplinasMatriculadas(String[] discplinasMatriculadas) {
        this.discplinasMatriculadas = discplinasMatriculadas;
    }
}
