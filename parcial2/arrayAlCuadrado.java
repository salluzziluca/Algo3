package parcial2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class arrayAlCuadrado {
    public ArrayList<Integer> arrayAlCuadrado(ArrayList<Integer> numeros) {
        ArrayList<Integer> resultado = numeros.stream().map(x -> x * x)
                .collect(Collectors.toCollection(ArrayList::new));
        return resultado;
    }
}
