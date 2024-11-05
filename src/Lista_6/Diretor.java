/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class Diretor extends Funcionario {
    private int departamentos;
    
    Diretor(String nome, double salario, int departamentos){
        super(nome, salario);
        this.departamentos = departamentos;
    }
    
    @Override
    public double getBonus(){
        return 4*this.salario + 3000.00*departamentos;
    }
    
}
