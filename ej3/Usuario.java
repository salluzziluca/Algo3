package ej3;

public class Usuario {
    String nombre;
    String contraseña;
    Mensaje[] mensajes;

    public Usuario(String nombre, String contraseña, Mensaje[] mensajes) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.mensajes = mensajes;
    }
}