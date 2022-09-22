package ej3;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Cartelera cartelera = new Cartelera();
        Personal personal = new Personal("admin", "admin", new ArrayList<Mensaje>(), "admin");
        Usuario usuario1 = personal.crear_usuario(cartelera, "Luca", "1234");
        Usuario usuario2 = personal.crear_usuario(cartelera, "Pablo", "1234");

        boolean login = cartelera.login("Luca", "1234");
        if (login) {
            System.out.println("Login correcto");
            Mensaje mensaje = new Texto("Hola", Calendar.getInstance(), usuario1, usuario2);
            Mensaje mensaje2 = new Link("https://www.google.com", Calendar.getInstance(), usuario1, usuario2);
            Mensaje mensaje3 = new Video("https://www.youtube.com/watch?v=QH2-TGUlwu4", Calendar.getInstance(),
                    usuario1, usuario2);
            Mensaje mensaje4 = new Imagen("https://www.google.com", Calendar.getInstance(), usuario1, usuario2);
            usuario1.EnviarMensaje(mensaje, cartelera, "Pablo");
            usuario1.EnviarMensaje(mensaje2, cartelera, "Pablo");
            usuario1.EnviarMensaje(mensaje3, cartelera, "Pablo");
            usuario1.EnviarMensaje(mensaje4, cartelera, "Pablo");
            cartelera.logout();
            login = cartelera.login("Pablo", "1234");
            if (login) {
                System.out.println("Login correcto");
                usuario2.verMensajes();
                cartelera.logout();
            } else {
                System.out.println("Login incorrecto");
            }
        } else {
            System.out.println("Login incorrecto");
        }
    }
}
