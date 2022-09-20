package ej3;

import java.util.ArrayList;

public class Personal extends Usuario {
    String puesto;

    public Personal(String nombre, String contraseña, ArrayList<Mensaje> muro, String puesto) {
        super(nombre, contraseña, muro);
        this.puesto = puesto;
    }

}
