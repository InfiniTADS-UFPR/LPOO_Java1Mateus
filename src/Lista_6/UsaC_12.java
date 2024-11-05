/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class UsaC_12 {
    
    public static void main(String args[]){
        System.out.println("Iniciando o programa...");
        System.out.println("Instanciando C_12 sem parametros:");
        C_12 objC1 = new C_12();
        System.out.println("Instanciando C_12 com parametros:");
        C_12 objC2 = new C_12("XPTO", 3.141516f);
        System.out.println("Chamando operações na instancia 1:");
        objC1.operacao1();
        objC1.operacao2();
        System.out.println("Chamando operações na instancia 2:");
        objC2.operacao1();
        objC2.operacao2();
        System.out.println("Instanciando objeto em referencia para interface:");
        I1 objC3 = new C_12("YSBC", 1.99f);
        System.out.println("Chamando operações na referencia para interface:");
        objC3.operacao1();
    }
    
}
