package ej3;

import java.util.HashMap;

public class Cartelera {
    // un hash map de Usuarios
    private HashMap<String, Usuario> usuarios;
    private String usuarioLogeado;

    public Cartelera() {
        this.usuarios = new HashMap<String, Usuario>();
        this.usuarioLogeado = null;
    }

    public void registrarUsuario(String nombre, Usuario usuario) {
        this.usuarios.put(nombre, usuario);
    }

    public boolean login(String nombre, String contraseña) {
        if (usuarios.containsKey(nombre)) {
            Usuario usuario = usuarios.get(nombre);
            if (usuario.AutenticarPassword(contraseña)) {
                usuarioLogeado = nombre;
                return true;
            }
        }
        return false;
    }

    public boolean logout() {
        if (usuarioLogeado != null) {
            usuarioLogeado = null;
            return true;
        }
        return false;
    }

}
