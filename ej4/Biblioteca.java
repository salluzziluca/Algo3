package ej4;

public class Biblioteca {
    private Libro[] libros;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    public Libro getLibro(int codigo) {
        Libro libro_pedido = null;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == codigo) {
                libro_pedido = libros[i];
            }
        }
        return libro_pedido;
    }
}
