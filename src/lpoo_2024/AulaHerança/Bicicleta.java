/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_2024.AulaHerança;

/**
 *
 * @author mateus
 */
public class Bicicleta {
    protected double velocidade = 0.0;
    private int marcha = 1;
    
    private void mudaMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public void pedalar(int pedalada, int forca){
        velocidade = velocidade + pedalada*forca;
    }
    
    public void frear(double forca){
        velocidade = velocidade - forca*velocidade;
    }
    
    public void imprimeEstado(){
        System.out.println("velocidade ="+velocidade+"\n"+"marcha ="+marcha);
    }
    
}
