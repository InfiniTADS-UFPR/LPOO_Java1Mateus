/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteTela;

/**
 *
 * @author rafae
 */
public abstract class Conta implements ContaI {
    private int numero;
    private double saldo;
    private Cliente dono;
    
    @Override
    public boolean deposita(double valor) {
        if(valor < 0) {
            return false;
        }
        this.saldo+=valor;
        return true;
    }
    
    @Override
    public boolean saca(double valor) {
        if(valor < 0) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }
    
    @Override
    public int getNumero() {
        return numero;
    };
    
    @Override
    public double getSaldo() {
        return saldo;
    };
    
    @Override
    public abstract void remunera();

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public Cliente getDono() {
        return dono;
    }

    
    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    
    
    
}
