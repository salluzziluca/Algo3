package ej3;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Cartelera cartelera = new Cartelera();
        Usuario usuario1 = new Usuario("Luca", "1234", new ArrayList<Mensaje>());
        Usuario usuario2 = new Usuario("Pablo", "1234", new ArrayList<Mensaje>());
        cartelera.registrarUsuario(usuario1.getNombre(), usuario1);
        cartelera.registrarUsuario(usuario2.getNombre(), usuario2);
        boolean login = cartelera.login("Luca", "1234");
        if (login) {
            System.out.println("Login correcto");
            Mensaje mensaje = new Texto("Hola", Calendar.getInstance(), usuario1, usuario2);
            usuario1.EnviarMensaje(mensaje, cartelera, "Pablo");
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
