package br.ufpr.lpoo.tarefa07.exercicio6;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaRH {

    public static void main(String[] args) {
        try {
            Analista analista = new Analista("Maria", "Analista", 5000, "Negócios");
            Analista analista2 = new Analista("José", "Analista", 5000, "Negócios");
            Programador programador = new Programador("Pedro", "Programador", 3500, "TI");
            Programador programador2 = new Programador("Paulo", "Programador", 3500, "TI");
            Auxiliar auxiliar = new Auxiliar("Ana", "Auxiliar de limpeza", 2000, "TI");
            Gerente gerente = new Gerente("João", "Gerente", 10000, "TI",
                    new ArrayList<>(Arrays.asList(analista, analista2, programador, programador2, auxiliar)));
            Diretor diretor = new Diretor("Carlos", "Diretor", 20000, "Diretoria",
                    new ArrayList<>(Arrays.asList("TI", "Negócios")));
            System.out.println(imprimeRelatorio(new Funcionario[]{gerente, analista, analista2, programador, auxiliar, diretor}));
        }catch (InsufficientValueException e){
            System.out.println(e.getMessage());
        }
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
