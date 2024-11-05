/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

import Lista_6.*;

/**
 *
 * @author mateus
 */
public class Gerente extends Funcionario {
    protected int qtdadeFuncionarios;
    
    Gerente(String nome, double salario, int qtdadeFuncionarios) throws Exception {
        super(nome,salario);
        if (qtdadeFuncionarios<5){
            throw new Exception("Funcionarios insuficientes.");
        }
        this.qtdadeFuncionarios = qtdadeFuncionarios;
    }
    
    void setFuncionarios(int qtdadeFuncionarios) throws Exception{
        if (qtdadeFuncionarios<5){
            throw new Exception("Funcionarios insuficientes no set.");
        }
        this.qtdadeFuncionarios = qtdadeFuncionarios;
    }
    
    @Override
    public double getBonus(){
        return (this.salario*2 + 100.00*qtdadeFuncionarios);
    }
    
    
}
