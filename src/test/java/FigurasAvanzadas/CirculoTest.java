package FigurasAvanzadas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


public class CirculoTest {
    private static Double errorAdmitido = 1e-6;
    Circulo c1;
    Circulo c2;
    Circulo c3;
    Circulo c4;

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Before
    public void crearCirculos () {
        c1 = new Circulo (170);
        c2 = new Circulo (90);
        c3 = new Circulo (150);
        c4 = new Circulo (210);
    }

    @Test
    public void testConstrutor1Argumento () {
        assertEquals(Integer.valueOf(170), c1.getRadio());
        assertEquals(Integer.valueOf(90), c2.getRadio());
    }

    @Test
    public void testConstrutor2Argumentos () {
        assertEquals(Integer.valueOf(150), c3.getRadio());
        assertEquals(Integer.valueOf(210), c4.getRadio());
    }

    @Test
    public void testConstrutorID () {
        assertEquals("Circulo1", c1.getId());
        assertEquals("Circulo2", c2.getId());
        assertEquals("Circulo3", c3.getId());
        assertEquals("Circulo4", c4.getId());
    }

    // @DisplayName("Verifica valor de la base")
    @Test
    public void testSetBase () {
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(-1);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(0);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(1);
        assertEquals(Integer.valueOf(1), c1.getRadio());
        c1.setRadio(100);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(600);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(501);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(500);
        assertEquals(Integer.valueOf(500), c1.getRadio());
        c1.setRadio(499);
        assertEquals(Integer.valueOf(499), c1.getRadio());
    }

    // @DisplayName("Verifica valor de la radio")
    @Test
    public void testSetAltura () {
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(-1);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(0);
        assertEquals(Integer.valueOf(170), c1.getRadio());
        c1.setRadio(1);
        assertEquals(Integer.valueOf(1), c1.getRadio());
        c1.setRadio(100);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(600);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(501);
        assertEquals(Integer.valueOf(100), c1.getRadio());
        c1.setRadio(500);
        assertEquals(Integer.valueOf(500), c1.getRadio());
        c1.setRadio(499);
        assertEquals(Integer.valueOf(499), c1.getRadio());
    }

    @Test
    public void testPerimetro () {
        assertEquals(Double.valueOf(1067), c1.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(565), c2.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(942), c3.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(1318), c4.getPerimetro(), errorAdmitido);
    }

    @Test
    public void testSuperficie () {
        assertEquals(Double.valueOf(90746), c1.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(25434),  c2.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(70650), c3.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(138474), c4.getSuperficie(), errorAdmitido);
    }

    @Test
    public void testToStringLocal () {
        assertEquals("Radio=170", c1.toString().split(" \\+\\+ ")[1]);
        assertEquals("Radio=90", c2.toString().split(" \\+\\+ ")[1]);
        assertEquals("Radio=150", c3.toString().split(" \\+\\+ ")[1]);
        assertEquals("Radio=210", c4.toString().split(" \\+\\+ ")[1]);
    }

    @Test
    public void testToStringCompleto () {
        assertEquals("Figura Circulo1 (null,null) ++ Radio=170", c1.toString());
        assertEquals("Figura Circulo2 (null,null) ++ Radio=90", c2.toString());
        assertEquals("Figura Circulo3 (null,null) ++ Radio=150", c3.toString());
        assertEquals("Figura Circulo4 (null,null) ++ Radio=210", c4.toString());
    }

    @Test
    public void testCompareTo () {
        assertEquals( 0, c1.compareTo(c1));
        assertEquals( 1, c1.compareTo(c2));
        c2.setAltura(289);
        c2.setBase(100);
        assertEquals(-1, c1.compareTo(c2));
        assertEquals(-1, c1.compareTo(c4));
        c1.setAltura(210);
        c1.setBase(190);
        assertEquals(-1, c1.compareTo(c4));
        c1.setBase(191);
        assertEquals( 1, c1.compareTo(c4));
    }

    /**
     * Test of getPerimetro method, of class Circulo.
     */
    @org.junit.Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        Circulo instance = null;
        Double expResult = null;
        Double result = instance.getPerimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuperficie method, of class Circulo.
     */
    @org.junit.Test
    public void testGetSuperficie() {
        System.out.println("getSuperficie");
        Circulo instance = null;
        Double expResult = null;
        Double result = instance.getSuperficie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadio method, of class Circulo.
     */
    @org.junit.Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = null;
        Integer expResult = null;
        Integer result = instance.getRadio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}