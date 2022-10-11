package ej4;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Libro> librosPedidos = new ArrayList<Libro>();

    public Alumno(int padrón) {
    }

    public void PedirLibro(Biblioteca Biblioteca, Libro Libro) {
        Libro libro_pedido = Biblioteca.getLibro(Libro.getCodigo());
        if (libro_pedido != null) {
            librosPedidos.add(libro_pedido);
            System.out.println("El libro " + libro_pedido.getTitulo() + " ha sido pedido");
        } else {
            System.out.println("El libro " + Libro.getTitulo() + " no se encuentra en la biblioteca");
        }
    }
}
