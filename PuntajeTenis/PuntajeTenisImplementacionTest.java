package PuntajeTenis;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PuntajeTenisImplementacionTest {

    @Test
    public void testEmpiezaSacandoElLocal() {
        var p = new PuntajeTenisImplementacion();
        var juegadorQueSaca = p.servicio();
        assertEquals(PuntajeTenis.Jugador.LOCAL, juegadorQueSaca);
    }

    @Test
    public void testPuntajeGameEmpieza0a0() {
        var p = new PuntajeTenisImplementacion();
        var puntajeGame = p.puntajeGame();
        assertEquals(PuntajeTenis.Puntos.CERO, puntajeGame[0]);
        assertEquals(PuntajeTenis.Puntos.CERO, puntajeGame[1]);
    }

    @Test
    public void testPuntajeSetsEmpieza0a0() {
        var p = new PuntajeTenisImplementacion();
        var puntajeSets = p.puntajeSets();
        assertArrayEquals(new int[][] { { 0, 0 } }, puntajeSets);
    }

    @Test
    public void testPuntoLocal() {
        var p = new PuntajeTenisImplementacion();
        p.punto(PuntajeTenis.Jugador.LOCAL);
        var puntajeGame = p.puntajeGame();
        assertEquals(PuntajeTenis.Puntos.QUINCE, puntajeGame[0]);
        assertEquals(PuntajeTenis.Puntos.CERO, puntajeGame[1]);
    }
}
