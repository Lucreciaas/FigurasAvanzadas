/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasAvanzadas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PosicionTest {
    
    public PosicionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of distanciaAlOrigen method, of class Posicion.
     */
    @org.junit.Test
    public void testDistanciaAlOrigen() {
        System.out.println("distanciaAlOrigen");
        Posicion instance = new Posicion();
        Double expResult = null;
        Double result = instance.distanciaAlOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Posicion.
     */
    @org.junit.Test
    public void testGetX() {
        System.out.println("getX");
        Posicion instance = new Posicion();
        Integer expResult = null;
        Integer result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Posicion.
     */
    @org.junit.Test
    public void testSetX() {
        System.out.println("setX");
        Integer x = null;
        Posicion instance = new Posicion();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Posicion.
     */
    @org.junit.Test
    public void testGetY() {
        System.out.println("getY");
        Posicion instance = new Posicion();
        Integer expResult = null;
        Integer result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Posicion.
     */
    @org.junit.Test
    public void testSetY() {
        System.out.println("setY");
        Integer y = null;
        Posicion instance = new Posicion();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Posicion.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Posicion instance = new Posicion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Posicion.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Posicion otro = null;
        Posicion instance = new Posicion();
        int expResult = 0;
        int result = instance.compareTo(otro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
