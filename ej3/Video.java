package ej3;

import java.util.Calendar;

public class Video extends Link {
    public Video(String texto, Calendar fecha, Usuario emisor, Usuario receptor) {
        super(texto, fecha, emisor, receptor);
    }

    public void MostrarMensaje() {
        System.out.println("Video de " + emisor.nombre + " a " + receptor.nombre + " el " + fecha.getTime());
        System.out.println(texto);
    }

}
