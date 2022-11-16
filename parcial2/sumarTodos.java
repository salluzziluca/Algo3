package parcial2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class sumarTodos {
    public int sumarTodos(ArrayList<Integer> numeros) {
        int resultado = numeros.stream().reduce((x, y) -> x + y).get();
        return resultado;
    }
}
