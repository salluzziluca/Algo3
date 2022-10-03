package PuntajeTenis;

public class PuntajeTenisImplementacion implements PuntajeTenis {
    Puntos[] puntajeGame;

    public PuntajeTenisImplementacion() {
        puntajeGame = new Puntos[2];
        puntajeGame[0] = Puntos.CERO;
        puntajeGame[1] = Puntos.CERO;
    }

    @Override
    public void punto(Jugador j) {
        int n = j.ordinal();

        switch (puntajeGame[n]) {
            case CERO:
                puntajeGame[n] = Puntos.QUINCE;
                break;
            case QUINCE:
                puntajeGame[n] = Puntos.TREINTA;
                break;
            case TREINTA:
                puntajeGame[n] = Puntos.CUARENTA;
                break;
            case CUARENTA:
                puntajeGame[n] = Puntos.VENTAJA;
                break;
            case VENTAJA:
                break;

        }
    }

    @Override
    public Jugador servicio() {
        return Jugador.LOCAL;
    }

    @Override
    public int[][] puntajeSets() {
        return new int[][] { { 0, 0 } };

    }

    @Override
    public Puntos[] puntajeGame() {
        return new Puntos[] { Puntos.CERO, Puntos.CERO };
    }

}
