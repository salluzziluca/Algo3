package ej3;

public class Personal extends Usuario {
    String puesto;

    public Personal(String nombre, String contraseña, Mensaje[] mensajes, String puesto) {
        super(nombre, contraseña, mensajes);
        this.puesto = puesto;
    }

}
