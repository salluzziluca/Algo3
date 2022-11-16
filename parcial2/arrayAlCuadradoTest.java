package parcial2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class arrayAlCuadradoTest {

    @Test
    public void testArrayAlCuadrado() {
        arrayAlCuadrado arrayAlCuadrado = new arrayAlCuadrado();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        ArrayList<Integer> resultado = arrayAlCuadrado.arrayAlCuadrado(numeros);

        assert (resultado.get(0) == 1);
        assert (resultado.get(1) == 4);
        assert (resultado.get(2) == 9);
        assert (resultado.get(3) == 16);

    }

    @Test
    public void testearSumarTodos() {
        sumarTodos sumarTodos = new sumarTodos();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        int resultado = sumarTodos.sumarTodos(numeros);

        assert (resultado == 10);
    }

    @Test
    public void testearMediaYMediana() {
        MediaYMediana MediaYMediana = new MediaYMediana();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(12);
        numeros.add(46);
        numeros.add(32);
        numeros.add(64);

        ArrayList<Integer> resultado = MediaYMediana.MediaYMediana(numeros);
        assertEquals(38, (int) resultado.get(0));
        assertEquals(46, (int) resultado.get(1));
    }

    @Test
    public void testearIniciales() {
        Iniciales Iniciales = new Iniciales();
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Jose");
        ArrayList<Character> iniciales = Iniciales.iniciales(nombres);
        assertEquals("J", iniciales.get(0).toString());
        assertEquals("P", iniciales.get(1).toString());
        assertEquals("M", iniciales.get(2).toString());
        assertEquals("J", iniciales.get(3).toString());
    }

}
