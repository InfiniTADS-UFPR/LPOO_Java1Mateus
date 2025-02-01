package br.ufpr.lpoo.tarefa06.exercicio3;

public class SistemaRH {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "Gerente", 10000, "TI");
        Analista analista = new Analista("Maria", "Analista", 5000, gerente, "TI");
        Analista analista2 = new Analista("José", "Analista", 5000, gerente, "TI");
        Programador programador = new Programador("Pedro", "Programador", 3500, gerente, "TI");
        Auxiliar auxiliar = new Auxiliar("Ana", "Auxiliar de limpeza", 2000, gerente, "TI");
        Diretor diretor = new Diretor("Carlos", "Diretor", 20000, "TI");
        System.out.println(imprimeRelatorio(new Funcionario[]{gerente, analista, analista2, programador, auxiliar, diretor}));
    }

    public static String imprimeRelatorio(Funcionario[] listaFuncionarios) {
        if(listaFuncionarios.length==0)
            return "Nenhum funcionário encontrado.";
        String relatorio="| Nome | Cargo | Salario | Gerente/Funcionários | Departamento | Bonus |";
        for(Funcionario f:listaFuncionarios){
            relatorio += "\n" + f.toString();
        }
        return relatorio;
    }
}
