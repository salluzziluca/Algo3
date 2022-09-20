package ej6;

import java.util.ArrayList;

public class ListaDuplicante<T> extends ArrayList<T> {

    @Override
    public boolean add(T e) {
        super.add(e);
        super.add(e);
        return true;
    }
}
