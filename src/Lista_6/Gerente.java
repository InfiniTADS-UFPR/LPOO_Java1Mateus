/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Gerente extends Funcionario {
    protected int qtdadeFuncionarios;
    
    Gerente(String nome, double salario, int qtdadeFuncionarios){
        super(nome,salario);
        this.qtdadeFuncionarios = qtdadeFuncionarios;
    }
    
    @Override
    public double getBonus(){
        return (this.salario*2 + 100.00*qtdadeFuncionarios);
    }
    
    
}
