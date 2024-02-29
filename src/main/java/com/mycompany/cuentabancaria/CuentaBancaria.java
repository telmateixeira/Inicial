/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

import Clases.CuentaAhorra;
import Clases.CuentaCorriente;
import Clases.NumCuenta;
import Clases.Titular;

/**
 *
 * @author Diurno
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        NumCuenta c = new NumCuenta("1247", "0004", "75", "4567891235");
        System.out.println(c.toString());
        System.out.println(c.toString());
        Titular t = new Titular("Telma", "Teixeiera",18);
        CuentaCorriente c1 = new CuentaCorriente(t, c);
        CuentaCorriente c2 = new CuentaAhorra(new Titular("Telma", "Teixeira", 18),
                new NumCuenta("1247", "0004", "75", "4567891235"));
        System.out.println(c1.equals(c2));
        
    }
}
