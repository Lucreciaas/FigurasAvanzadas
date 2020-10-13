package FigurasAvanzadas;



public class TrianguloTest {
    private static Double errorAdmitido = 1e-6;
    Triangulo t1;
    Triangulo t2;
    Triangulo t3;
    Triangulo t4;

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
    public void crearTriangulos () {
        t1 = new Triangulo(170);
        t2 = new Triangulo(90);
        t3 = new Triangulo(150, 90);
        t4 = new Triangulo(210, 190);
    }

    @Test
    public void testConstrutor1Argumento () {
        assertEquals(Integer.valueOf(170), t1.getBase());
        assertEquals(Integer.valueOf(170), t1.getAltura());
        assertEquals(Integer.valueOf(90), t2.getBase());
        assertEquals(Integer.valueOf(90), t2.getAltura());
    }

    @Test
    public void testConstrutor2Argumentos () {
        assertEquals(Integer.valueOf(150), t3.getBase());
        assertEquals(Integer.valueOf(90), t3.getAltura());
        assertEquals(Integer.valueOf(210), t4.getBase());
        assertEquals(Integer.valueOf(190), t4.getAltura());
    }

    @Test
    public void testConstrutorID () {
        assertEquals("Rectangulo1", t1.getId());
        assertEquals("Rectangulo2", t2.getId());
        assertEquals("Rectangulo3", t3.getId());
        assertEquals("Rectangulo4", t4.getId());
    }

    // @DisplayName("Verifica valor de la base")
    @Test
    public void testSetBase () {
        assertEquals(Integer.valueOf(170), t1.getBase());
        t1.setBase(-1);
        assertEquals(Integer.valueOf(170), t1.getBase());
        t1.setBase(0);
        assertEquals(Integer.valueOf(170), t1.getBase());
        t1.setBase(1);
        assertEquals(Integer.valueOf(1), t1.getBase());
        t1.setBase(100);
        assertEquals(Integer.valueOf(100), t1.getBase());
        t1.setBase(600);
        assertEquals(Integer.valueOf(100), t1.getBase());
        t1.setBase(501);
        assertEquals(Integer.valueOf(100), t1.getBase());
        t1.setBase(500);
        assertEquals(Integer.valueOf(500), t1.getBase());
        t1.setBase(499);
        assertEquals(Integer.valueOf(499), t1.getBase());
    }

    // @DisplayName("Verifica valor de la altura")
    @Test
    public void testSetAltura () {
        assertEquals(Integer.valueOf(170), t1.getAltura());
        t1.setAltura(-1);
        assertEquals(Integer.valueOf(170), t1.getAltura());
        t1.setAltura(0);
        assertEquals(Integer.valueOf(170), t1.getAltura());
        t1.setAltura(1);
        assertEquals(Integer.valueOf(1), t1.getAltura());
        t1.setAltura(100);
        assertEquals(Integer.valueOf(100), t1.getAltura());
        t1.setAltura(600);
        assertEquals(Integer.valueOf(100), t1.getAltura());
        t1.setAltura(501);
        assertEquals(Integer.valueOf(100), t1.getAltura());
        t1.setAltura(500);
        assertEquals(Integer.valueOf(500), t1.getAltura());
        t1.setAltura(499);
        assertEquals(Integer.valueOf(499), t1.getAltura());
    }

    @Test
    public void testPerimetro () {
        assertEquals(Double.valueOf(72420), t1.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(20340), t2.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(27600), t3.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(94460), t4.getPerimetro(), errorAdmitido);
    }

    @Test
    public void testSuperficie () {
        assertEquals(Double.valueOf(14450), t1.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(4050),  t2.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(6750), t3.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(19950), t4.getSuperficie(), errorAdmitido);
    }

    @Test
    public void testToStringLocal () {
        assertEquals("Altura=170, Base=170", t1.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=90", t2.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=150", t3.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=190, Base=210", t4.toString().split(" \\+\\+ ")[1]);
    }

    @Test
    public void testToStringCompleto () {
        assertEquals("Figura Rectangulo1 (null,null) ++ Altura=170, Base=170", t1.toString());
        assertEquals("Figura Rectangulo2 (null,null) ++ Altura=90, Base=90", t2.toString());
        assertEquals("Figura Rectangulo3 (null,null) ++ Altura=90, Base=150", t3.toString());
        assertEquals("Figura Rectangulo4 (null,null) ++ Altura=190, Base=210", t4.toString());
    }

    @Test
    public void testCompareTo () {
        assertEquals( 0, t1.compareTo(t1));
        assertEquals( 1, t1.compareTo(t2));
        t2.setAltura(289);
        t2.setBase(100);
        assertEquals(-1, t1.compareTo(t2));
        assertEquals(-1, t1.compareTo(t4));
        t1.setAltura(210);
        t1.setBase(190);
        assertEquals(-1, t1.compareTo(t4));
        t1.setBase(191);
        assertEquals( 1, t1.compareTo(t4));
    }

    /**
     * Test of getPerimetro method, of class Triangulo.
     */
    @org.junit.Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        Triangulo instance = null;
        Double expResult = null;
        Double result = instance.getPerimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuperficie method, of class Triangulo.
     */
    @org.junit.Test
    public void testGetSuperficie() {
        System.out.println("getSuperficie");
        Triangulo instance = null;
        Double expResult = null;
        Double result = instance.getSuperficie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class Triangulo.
     */
    @org.junit.Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangulo instance = null;
        Integer expResult = null;
        Integer result = instance.getBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Triangulo.
     */
    @org.junit.Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Triangulo instance = null;
        Integer expResult = null;
        Integer result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangulo.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Triangulo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}