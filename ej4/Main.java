package ej4;

public class Main {
    public Alumno alumno = new Alumno(1234);
    public Libro libro = new Libro("El principito", 1234, new String[] { "Antoine de Saint-Exupéry" }, 1943, 1);
    public Libro[] libros = new Libro[] { libro };
    public Biblioteca biblioteca = new Biblioteca(libros);

    public void main() {
        alumno.PedirLibro(biblioteca, libro);
    }

}
