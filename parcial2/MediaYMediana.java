package parcial2;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MediaYMediana {

    public ArrayList<Integer> MediaYMediana(ArrayList<Integer> numeros) {
        int media = numeros.stream().reduce((x, y) -> x + y).map(x -> x / numeros.size()).get();
        ArrayList<Integer> numerosOrdenados = numeros.stream().sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        int mediana = numerosOrdenados.get(numerosOrdenados.size() / 2);

        ArrayList<Integer> resultado = new ArrayList<Integer>();
        resultado.add(media);
        resultado.add(mediana);
        return resultado;
    }
}