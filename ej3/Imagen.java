package ej3;

import java.util.*;

public class Imagen extends Link {
    public Imagen(String texto, Calendar fecha, Usuario emisor, Usuario receptor) {
        super(texto, fecha, emisor, receptor);
    }

    public void MostrarMensaje() {
        System.out.println("Imagen de " + emisor.nombre + " a " + receptor.nombre + " el " + fecha.getTime());
        System.out.println(texto);
    }

}
