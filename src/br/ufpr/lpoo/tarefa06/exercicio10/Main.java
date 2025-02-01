package br.ufpr.lpoo.tarefa06.exercicio10;

public class Main {
    public static void main(String[] args){
        System.out.println("Iniciando o programa...");
        System.out.println("Instanciando C_12 sem parâmetros:");
        C_12 objC1 = new C_12();
        System.out.println("Instanciando C_12 com parâmetros:");
        C_12 objC2 = new C_12("XPTO", 3.141516f);
        System.out.println("Chamando operações na instância 1: ");
        objC1.operacao1();
        objC1.operacao2();
        System.out.println("Chamando operações na instância 2: ");
        objC2.operacao1();
        objC2.operacao2();
        System.out.println("Instanciando objeto em referência para a interface:");
        I1 objI = new C_12("YSBC", 1.99f);
        System.out.println("Chamando operações na referência para a interface: ");
        objI.operacao1();
    }
}
