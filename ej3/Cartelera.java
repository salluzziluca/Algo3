package ej3;

import java.util.HashMap;

public class Cartelera {
    // un hash map de Usuarios
    private HashMap<String, Usuario> usuarios;
    private String usuarioLogeado;

    public Cartelera() {
        usuarios = new HashMap<String, Usuario>();
        usuarioLogeado = null;
    }

    public void registrarUsuario(String nombre, Usuario usuario) {
        usuarios.put(nombre, usuario);
    }

    public boolean existeUsuario(String nombre) {
        return usuarios.containsKey(nombre);
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

    public boolean pasarMensaje(String receptor, Mensaje mensaje) {
        if (usuarios.containsKey(receptor)) {
            Usuario usuario = usuarios.get(receptor);

            usuario.RecibirMensaje(mensaje);
            return true;
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
