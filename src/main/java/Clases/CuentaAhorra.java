/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Diurno
 */
public class CuentaAhorra extends CuentaCorriente{
    
    private double interes;

    public CuentaAhorra(double interes, Titular titular, NumCuenta numC, double saldo) {
        super(titular, numC, saldo);
        this.interes = interes;
    }

    public CuentaAhorra(double interes, Titular titular, NumCuenta numC) {
        super(titular, numC);
        this.interes = interes;
        this.saldo=15.3;
    }

    public CuentaAhorra(Titular titular, NumCuenta numC) {
        super(titular, numC);
        this.saldo=15.3;
        this.interes = 2.5;
    }

    public double getInteres() {
        return interes;
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
    
    public double calcularInteres(){
        double i = saldo * interes;
        super.saldo = i;
        return super.saldo;
    }

    @Override
    public String toString() {
        return super.toString2() + " interes=" + interes + '}';
    }
    
    
    
    
}
