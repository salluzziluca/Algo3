package ej3;

import java.util.*;

public abstract class Mensaje {
    String texto;
    Calendar fecha;
    Usuario emisor;
    Usuario receptor;

    public Mensaje(String texto, Calendar fecha, Usuario emisor, Usuario receptor) {
        this.texto = texto;
        this.fecha = fecha;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public void MostrarMensaje() {
    }

}