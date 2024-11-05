/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_2024;

/**
 *
 * @author mateus
 */
public class Bicicleta {
    private double velocidade = 0.0;
    private int marcha = 1;
    
    public void mudaMarcha(int novoValor){
        marcha = novoValor;
    }
    
    public void pedalar(int pedalada, double forca){
        velocidade = velocidade + pedalada*forca;
    }
    
    public void frear(double forca){
        velocidade = velocidade - forca*velocidade;
        if (velocidade < 0.0){
            velocidade = 0.0;
        }
    }
    
    public void imprimeEstado(){
        System.out.println("Velocidade ="+velocidade+" - marcha ="+marcha);
    }
}
