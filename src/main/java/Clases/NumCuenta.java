/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Diurno
 */
public class NumCuenta {
    private String banco, sucursal, digcontrol, numCuenta;

    public NumCuenta(String banco, String sucursal, String digcontrol, String numCuenta) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.digcontrol = digcontrol;
        this.numCuenta = numCuenta;
        if(!validar()){
            throw new IllegalArgumentException("Los valores no son correctos");
        }
    }
    
    public boolean validar(){
        return banco.matches("[0-9]{4}")&&
        sucursal.matches("[0-9]{4}")&& digcontrol.matches("[0-9]{2}")
                &&numCuenta.matches("[0-9]{10}");
    }
    
//    public void validar(){
//        if (!banco.matches("[0-9]{4}")) {
//            this.banco = "0000";
//        } 
//        if (!sucursal.matches("[0-9]{4}")) {
//            this.sucursal = "0000";
//        } 
//        if (!digcontrol.matches("[0-9]{2}")) {
//            this.digcontrol = "00";
//        } 
//        if (!numCuenta.matches("[0-9]{10}")) {
//            this.numCuenta = "0000000000";
//        } 
//    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
        validar();
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
        validar();
    }

    public String getDigcontrol() {
        return digcontrol;
    }

    public void setDigcontrol(String digcontrol) {
        this.digcontrol = digcontrol;
        validar();
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
        validar();
    }

    @Override
    public String toString() {
        return "NumCuenta: " + "banco=" + banco + ", sucursal=" + sucursal + ", digcontrol=" + digcontrol + ", numCuenta=" + numCuenta + '}';
    }

    
    
}
