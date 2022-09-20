package ej3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cartelera cartelera = new Cartelera();
        Usuario usuario1 = new Usuario("Luca", "1234", new ArrayList<Mensaje>());

        cartelera.registrarUsuario(usuario1.getNombre(), usuario1);
        boolean login = cartelera.login("Luca", "1234");
        if (login) {
            System.out.println("Login correcto");
        } else {
            System.out.println("Login incorrecto");
        }
    }
}
