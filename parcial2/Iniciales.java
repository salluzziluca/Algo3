package parcial2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Iniciales {
    public ArrayList<Character>

            iniciales(ArrayList<String> palabras) {
        return palabras.stream().map(x -> x.charAt(0)).collect(Collectors.toCollection(ArrayList::new));
    }

}
