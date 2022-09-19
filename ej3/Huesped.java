package ej3;

public class Huesped extends Usuario {
    int habitacion;

    public Huesped(String nombre, String contraseña, Mensaje[] mensajes, int habitacion) {
        super(nombre, contraseña, mensajes);
        this.habitacion = habitacion;
    }
}
