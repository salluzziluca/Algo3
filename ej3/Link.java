package ej3;

import java.util.Calendar;

public class Link extends Mensaje {

    public Link(String texto, Calendar fecha, Usuario emisor, Usuario receptor) {
        super(texto, fecha, emisor, receptor);
    }

    public void MostrarMensaje() {
        System.out.println("Link de " + emisor.nombre + " a " + receptor.nombre + " el " + fecha.getTime());
        System.out.println(texto);
    }

}
