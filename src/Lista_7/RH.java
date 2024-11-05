/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

/**
 *
 * @author mateus
 */
public class RH {
    public static void main (String[] args){
        try{
           Gerente g = new Gerente("Mateus",10000,5);
            Diretor d = new Diretor("Lucas", 5000,2);
            g.setFuncionarios(6);
            d.setDepartamentos(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
           Gerente g = new Gerente("Mateus",10000,5);
            Diretor d = new Diretor("Lucas", 5000,2);
            g.setFuncionarios(2);
            d.setDepartamentos(2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
           Gerente g = new Gerente("Mateus",10000,1);
            Diretor d = new Diretor("Lucas", 5000,2);
            g.setFuncionarios(2);
            d.setDepartamentos(2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
           Gerente g = new Gerente("Mateus",10000,5);
            Diretor d = new Diretor("Lucas", 5000,1);
            g.setFuncionarios(2);
            d.setDepartamentos(2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}
