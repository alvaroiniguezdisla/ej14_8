package aplicacion;
import java.util.ArrayList;
import java.util.List;
import dominio.ej14_8;
public class Principal {
    public static void main(String[] args) {
        List<String>lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        System.out.println(dominio.ej14_8.aMinusculas(lista));
    }
}
