/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Programador extends Funcionario{
    
    Programador(String nome, double salario){
        super(nome,salario);
    }
    
    @Override
    public double getBonus(){
        return this.salario*0.8;
    }
}
