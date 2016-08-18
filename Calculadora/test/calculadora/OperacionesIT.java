/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Montenegro
 */
public class OperacionesIT {
    
    public OperacionesIT() {
    }
    /**
     * Test of insertar method, of class Operaciones.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String val = "2";
        String txt_val1 = "2";
        int posicion = 0;
        Operaciones instance = new Operaciones();
        String expResult = "22";
        String result = instance.insertar(val, txt_val1, posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int val1 = 5;
        int val2 = 3;
        Operaciones instance = new Operaciones();
        int expResult = 8;
        int result = instance.suma(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int val1 = 5;
        int val2 = 2;
        Operaciones instance = new Operaciones();
        int expResult = 3;
        int result = instance.resta(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int val1 = 7;
        int val2 = 2;
        Operaciones instance = new Operaciones();
        int expResult = 3;
        int result = instance.division(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int val1 = 15;
        int val2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.multiplicacion(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
