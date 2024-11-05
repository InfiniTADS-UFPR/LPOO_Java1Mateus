/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_4;

/**
 *
 * @author mateus
 */
public class Ponto3D {
    private Double x,y,z;
    private String cor;
    private int intensidade;
    
    public void setIntensidade(int intensidade){
        this.intensidade = intensidade;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setXYZ(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void getIntensidade(){
        System.out.println(this.intensidade);
    }
    
    public void getCor(){
        System.out.println(this.cor);
    }
    
    public void getXYZ(){
        System.out.println(this.x+"-"+this.y+"-"+this.z);
    }
    
    public void calculaDistancia(Ponto3D p){
        Double distX = this.x-p.x;
        Double distY = this.y - p.y;
        Double distZ = this.z - p.z;
        Double distTotal = Math.sqrt(Math.pow(distX, 2)+Math.pow(distY, 2)+Math.pow(distZ, 2));
        System.out.printf("A distancia entre os pontons é: %.4f\n",distTotal);
    }
    
}
