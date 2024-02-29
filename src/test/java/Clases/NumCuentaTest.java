/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diurno
 */
public class NumCuentaTest {
    
    NumCuenta n;
    
    public NumCuentaTest() {
    }
    
    
    @BeforeEach
    public void setUp() {
        n = new NumCuenta("4561", "5954", "45", "45671");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of validar method, of class NumCuenta.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        NumCuenta instance = null;
        boolean expResult = false;
        boolean result = instance.validar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBanco method, of class NumCuenta.
     */
    @Test
    public void testGetBanco() {
        System.out.println("getBanco");
        NumCuenta instance = null;
        String expResult = "";
        String result = instance.getBanco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBanco method, of class NumCuenta.
     */
    @Test
    public void testSetBanco() {
        System.out.println("setBanco");
        String banco = "";
        NumCuenta instance = null;
        instance.setBanco(banco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSucursal method, of class NumCuenta.
     */
    @Test
    public void testGetSucursal() {
        System.out.println("getSucursal");
        NumCuenta instance = null;
        String expResult = "";
        String result = instance.getSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSucursal method, of class NumCuenta.
     */
    @Test
    public void testSetSucursal() {
        System.out.println("setSucursal");
        String sucursal = "";
        NumCuenta instance = null;
        instance.setSucursal(sucursal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDigcontrol method, of class NumCuenta.
     */
    @Test
    public void testGetDigcontrol() {
        System.out.println("getDigcontrol");
        NumCuenta instance = null;
        String expResult = "";
        String result = instance.getDigcontrol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDigcontrol method, of class NumCuenta.
     */
    @Test
    public void testSetDigcontrol() {
        System.out.println("setDigcontrol");
        String digcontrol = "";
        NumCuenta instance = null;
        instance.setDigcontrol(digcontrol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCuenta method, of class NumCuenta.
     */
    @Test
    public void testGetNumCuenta() {
        System.out.println("getNumCuenta");
        NumCuenta instance = null;
        String expResult = "";
        String result = instance.getNumCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCuenta method, of class NumCuenta.
     */
    @Test
    public void testSetNumCuenta() {
        System.out.println("setNumCuenta");
        String numCuenta = "";
        NumCuenta instance = null;
        instance.setNumCuenta(numCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class NumCuenta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NumCuenta instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
