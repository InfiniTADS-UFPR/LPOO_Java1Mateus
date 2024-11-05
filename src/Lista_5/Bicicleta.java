/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

/**
 *
 * @author mateus
 */
public class Bicicleta {
    private double velocidade;
    private int marcha;
    private int marchaMax;
    
    Bicicleta(int marchaMax){
        this.velocidade = 0;
        this.marchaMax = marchaMax;
    }
    
    Bicicleta(){
        this.velocidade = 0;
        this.marchaMax = 18;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarcha(int marcha) {
        if (marcha > marchaMax){
            return;
        }
        this.marcha = marcha;
    }

    public void setMarchaMax(int marchaMax) {
        this.marchaMax = marchaMax;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public int getMarchaMax() {
        return marchaMax;
    }
    
    public void mudarMarcha(int valor){
        if (this.marcha + valor > marchaMax){
            return;
        }
        this.marcha += valor;
    }
    
    public void pedalar(int pedalada, double forca){
        velocidade = velocidade + pedalada*forca;
    }
    
    public void frear(double forca){
        velocidade = velocidade - forca*velocidade;
    }
    
    public void imprimeEstado(){
        System.out.println("Velocidade : "+velocidade+" Marcha: "+marcha);
    }
        
}
