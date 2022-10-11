package ej4;

public class Libro {
   private final String titulo;
   private long codigo;

   public Libro(String titulo, Long codigo, String[] autores, int FechaPublicacion, int Cantidad) {
      this.titulo = titulo;
      this.codigo = codigo;
   }

   public long getCodigo() {
      return codigo;
   }

   public String getTitulo() {
      return titulo;
   }
}
