/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mateus
 */
public class UsaBicicleta {
    public static void main(String[] args){
        Bicicleta b1 = new Bicicleta(1,10,1);                
            try {
            b1.mudarCadencia(10);
            b1.aplicarFreios(1);
            b1.mudarMarcha(15);
            b1.printStates();
            b1.mudarCadencia(-10);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
