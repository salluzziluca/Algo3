package ej6;

import java.util.ArrayList;

public class ListaDuplicante2<T> {

    private ArrayList<T> lista;

    public ListaDuplicante2() {
        lista = new ArrayList<>();
    }

    public boolean add(T elemento) {
        lista.add(elemento);
        lista.add(elemento);
        return true;
    }

    @Override
    public String toString() {
        return lista.toString();
    }

}
