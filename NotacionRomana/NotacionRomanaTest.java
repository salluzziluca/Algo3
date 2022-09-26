package NotacionRomana;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotacionRomanaTest {
    @Test
    public void testUno() {
        var s = NotacionRomana.convertir(1);
        assertEquals("I", s);
    }

    @Test
    public void testDos() {
        var s = NotacionRomana.convertir(2);
        assertEquals("II", s);
    }

    @Test
    public void testTres() {
        var s = NotacionRomana.convertir(3);
        assertEquals("III", s);
    }

    @Test
    public void testCuatro() {
        var s = NotacionRomana.convertir(4);
        assertEquals("IV", s);
    }

    @Test
    public void testCinco() {
        var s = NotacionRomana.convertir(5);
        assertEquals("V", s);
    }

    @Test
    public void testSeis() {
        var s = NotacionRomana.convertir(6);
        assertEquals("VI", s);
    }

    @Test
    public void testSiete() {
        var s = NotacionRomana.convertir(7);
        assertEquals("VII", s);
    }

    @Test
    public void testOcho() {
        var s = NotacionRomana.convertir(8);
        assertEquals("VIII", s);
    }

}
