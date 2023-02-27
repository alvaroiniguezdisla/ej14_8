package dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ej14_8 {
    public static List<String> aMinusculas(List<String> lista){
        return Stream.iterate(0, i -> i + 1).limit(lista.size()).map(i -> lista.get(i).toLowerCase()).collect(Collectors.toList());
    }

}
