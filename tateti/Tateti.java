package tateti;

public class Tateti {
    private final int tamañoTablero;

    public Tateti(int tamañoTateti) {
        this.tamañoTablero = tamañoTateti;
    }

    public String jugar(int fila, int columna) {
        if (fila < 1 || fila > tamañoTablero) {
            return "Aun no hay un ganador";
        }
        return "";
    }

}
