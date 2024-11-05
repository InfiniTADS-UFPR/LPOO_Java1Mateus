/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

import Lista_4.*;

/**
 *
 * @author mateus
 */
public class Ponto3D {
    private Double x,y,z;
    private String cor;
    private int intensidade;
    
    private void setIntensidade(int intensidade){
        this.intensidade = intensidade;
    }
    
    private void setCor(String cor){
        this.cor = cor;
    }
    
    private void setXYZ(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    private void getIntensidade(){
        System.out.println(this.intensidade);
    }
    
    private void getCor(){
        System.out.println(this.cor);
    }
    
    private void getXYZ(){
        System.out.println(this.x+"-"+this.y+"-"+this.z);
    }
    
    private void calculaDistancia(Ponto3D p){
        Double distX = this.x-p.x;
        Double distY = this.y - p.y;
        Double distZ = this.z - p.z;
        Double distTotal = Math.sqrt(Math.pow(distX, 2)+Math.pow(distY, 2)+Math.pow(distZ, 2));
        System.out.printf("A distancia entre os pontons é: %.4f\n",distTotal);
    }
    
}
