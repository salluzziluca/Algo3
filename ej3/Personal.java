package ej3;

import java.util.ArrayList;

public class Personal extends Usuario {
    String puesto;

    public Personal(String nombre, String contraseña, ArrayList<Mensaje> muro, String puesto) {
        super(nombre, contraseña, muro);
        this.puesto = puesto;
    }

    public Usuario crear_usuario(Cartelera cartelera, String nombre, String contraseña9) {

        if (cartelera.existeUsuario(nombre)) {
            return null;
        } else {
            Usuario usuario = new Usuario(nombre, contraseña9, new ArrayList<Mensaje>());
            cartelera.registrarUsuario(nombre, usuario);
            return usuario;
        }
    }

}
