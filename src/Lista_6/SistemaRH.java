/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class SistemaRH {
    public static void main(String[] args){
        Gerente g = new Gerente("Mateus",5000.00,5);
        Diretor d = new Diretor("Emily",9000.00,3);
        Analista a = new Analista("Rafael",3000);
        Programador p = new Programador("Leonardo", 2500);
        AuxiliarLimpeza al = new AuxiliarLimpeza("Julimar", 1200);
        Funcionario[] listaFuncionario = new Funcionario[5];
        listaFuncionario[0] = g;
        listaFuncionario[1] = d;
        listaFuncionario[2] = a;
        listaFuncionario[3] = p;
        listaFuncionario[4] = al;
        
        imprimeRelatorio(listaFuncionario);
        
    }
    
    public static void imprimeRelatorio(Funcionario[] listaFuncionario){        
        for (Funcionario f : listaFuncionario){
            System.out.printf("Nome: %s, Salario: %.2f, Bonus: %.2f\n", f.nome,f.salario,f.getBonus());
        }
    }
}
