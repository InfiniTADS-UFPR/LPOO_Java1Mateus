/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_7;

/**
 *
 * @author mateus
 */
public class Bicicleta {
    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;
    
    Bicicleta(int cadencia, int velocidade, int marcha){
        this.cadencia = cadencia;
        this.marcha = marcha;
        this.velocidade = velocidade;
    }
    
    void mudarCadencia(int novoValor) throws Exception{
        if (novoValor < 0){
            throw new Exception("RPM negativo não pode ser setado.");
        }
        cadencia = novoValor;
    }
    
    void mudarMarcha(int novoValor) throws Exception{
        if (novoValor < 0 || novoValor > 24){
            throw new Exception("Valor de marcha é inutilizavel.");
        }
        marcha = novoValor;
    }
    
    void aumentarVelocidade(int incremento) throws Exception{
        if (velocidade + incremento > 100){
            throw new Exception("Velocidade acima de 100km/h não é permitida.");
        }
        velocidade += incremento;
    }
    
    void aplicarFreios(int decremento) throws Exception{
        if (velocidade - decremento<0){
            throw new Exception("Velocidades negativas não podem ser usadas.");
        }
        velocidade -= decremento;
    }
    
    void printStates(){
        System.out.println("cadencia="+cadencia+" velocidade="+velocidade+" marcha="+marcha);
    }
}
