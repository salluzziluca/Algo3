package ej4;

public class Libro {
   private final String titulo;
   private int codigo;
   private final String[] autores;
   private final int FechaPublicacion;
   private int Cantidad;

   public Libro(String titulo, int codigo, String[] autores, int FechaPublicacion, int Cantidad) {
      this.titulo = titulo;
      this.codigo = codigo;
      this.autores = autores;
      this.FechaPublicacion = FechaPublicacion;
   }

   public int getCodigo() {
      return codigo;
   }

   public String getTitulo() {
      return titulo;
   }
}
