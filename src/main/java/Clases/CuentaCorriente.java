/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author Diurno
 */
public class CuentaCorriente {
    protected Titular titular;
    protected NumCuenta numC;
    protected double saldo;

    public CuentaCorriente(Titular titular, NumCuenta numC) {
        this.titular = titular;
        this.numC = numC;
        this.saldo=15.3;
    }

    public CuentaCorriente(Titular titular, NumCuenta numC, double saldo) {
        this.titular = titular;
        this.numC = numC;
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public NumCuenta getNumC() {
        return numC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(double m){
        if (m > 0) {
           this.saldo += m; 
        }
    }
    
    public void reintegro(double r){
        if (r > 0) {
            this.saldo -= r;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente" + "numC=" + numC + ", saldo=" + saldo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //apuntan al mismo dato
            return true;
        }
        if (obj == null) { //si el objeto existe
            return false;
        }
        if ((!(obj instanceof CuentaCorriente))) { // si no es uan cuentacorriente false
            return false;
        }
        final CuentaCorriente other = (CuentaCorriente) obj;
        return other.toString2().equals(this.toString2());
    }
    
    public String toString2(){
        return titular.toString() + "-" + numC.toString() + ":" + saldo ;
    }
    
    
    
}
