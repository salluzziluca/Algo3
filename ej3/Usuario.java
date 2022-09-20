package ej3;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    String contraseña;
    ArrayList<Mensaje> muro;

    public Usuario(String nombre, String contraseña, ArrayList<Mensaje> muro) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.muro = muro;
    }

    public String getNombre() {
        if (nombre == null) {
            return "";
        }
        return nombre;
    }

    public boolean RecibirMensaje(Mensaje mensaje) {
        return muro.add(mensaje);
    }

    public boolean AutenticarPassword(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

}