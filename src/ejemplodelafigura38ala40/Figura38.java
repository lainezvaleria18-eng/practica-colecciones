package ejemplodelafigura38ala40;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Figura38 {

    public static void main(String[] args) {

        Set<String> lista = new LinkedHashSet<>();

        lista.add("hola");
        lista.add("programadores");
        lista.add("que tal?");
        lista.add("mañana dia libre");
        lista.add("programadores");
        lista.add("necesitamos vacaciones");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}