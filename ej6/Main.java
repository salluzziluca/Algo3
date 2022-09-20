package ej6;

public class Main {
    public static void main(String[] args) {
        var lista = new ListaDuplicante<Integer>();
        lista.add(3);
        lista.add(8);
        System.out.println(lista);

        var lista2 = new ListaDuplicante2<Integer>();
        lista2.add(3);
        lista2.add(8);
        System.out.println(lista2);

    }
}
