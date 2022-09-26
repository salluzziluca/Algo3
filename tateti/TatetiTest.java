package tateti;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TatetiTest {

    private Tateti juego;

    @Before
    public void arrange() {
        juego = new Tateti(3);
    }

    @Test
    public void constructorRecibeArgumento() {
        assertSame("Aun no hay un ganador", juego.jugar(4, 1));
    }
}
