/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_6;

/**
 *
 * @author mateus
 */
public class C_12 extends C implements I1,I2{
    public float[][] atributo3;
    
    C_12(){
        this.attibuto1 = "VAZIO";
        this.atributo2 = -999.99f;
        atributo3 = new float[2][2];
    }
    
    C_12(String atributo1, float atributo2){
        this.attibuto1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = new float[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                atributo3[i][j] = 1;
            }
        }
    }

    @Override
    public void operacao1() {
        String saida = "";
        for (int i=0;i<atributo3.length;i++){
            for (int j=0;j<atributo3.length;j++){
                saida += atributo3[i][j]+"\t";
            }
            saida += "\n";
        }
        System.out.println("Passou pela operação 1!!");
        System.out.printf(this.attibuto1+"\t"+this.atributo2+"\n"+
                saida);
    }

    @Override
    public void operacao2() {
        System.out.println("Passou pela operação 2!!!");
    }
}
