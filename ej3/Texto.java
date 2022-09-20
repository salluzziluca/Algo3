package ej3;

import java.util.*;

public class Texto extends Mensaje {
    public Texto(String texto, Calendar fecha, Usuario emisor, Usuario receptor) {
        super(texto, fecha, emisor, receptor);
    }

    public void MostrarMensaje() {
        System.out.println("Mensaje de " + emisor.nombre + " a " + receptor.nombre + " el " + fecha.getTime());
        System.out.println("Mensaje: " + texto);
    }

}
