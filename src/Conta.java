/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateus
 */
class Conta {
    private double saldo, limite;
    
    public Conta(){
        
    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    Conta(double d, double d0) {
        saldo = d;
        limite = d0;
    }
    
    double getsaldo() {
        return saldo;
    }

    boolean depositar(double d) {
        if (d>0){
            saldo += d;
            return true;
        }
        else
            return false;
    }

    boolean sacar(double d) {
        if ((saldo - d)>= (- limite)){
            saldo -= d;
            return true;
        }
        else 
            return false;
    }
    
}
