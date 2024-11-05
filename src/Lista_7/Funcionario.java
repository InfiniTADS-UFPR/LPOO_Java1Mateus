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
public abstract class Funcionario {
    protected String nome;
    protected double salario;
    
    Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract double getBonus();
    
}
