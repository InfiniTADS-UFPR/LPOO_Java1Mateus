package lpoo_2024.Aula5.Estatistica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateus
 */
public class Estatistica {
    private int count=0;
    private double soma, min,max, media;

    public void adicionaValor(double i) {
        soma += i;
        min = (i<min || count==0) ? i : min;
        max = (i>max || count == 0) ? i : max;
        count++;
        media = soma/count;
    }

    public double getSoma() {
      return soma   ;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getMed() {
        return media;
    }
}