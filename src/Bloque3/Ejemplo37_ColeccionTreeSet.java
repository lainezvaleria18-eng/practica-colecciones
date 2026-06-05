package Bloque3;
import java.util.TreeSet;

public class Ejemplo37_ColeccionTreeSet {

    public static void main(String[] args) {

        System.out.println("**************** LISTA 2 ****************");

        // Declaración de colección de tipo Equipo
        TreeSet<Equipo> equipos = new TreeSet<>();

        equipos.add(new Equipo(4, "Once Lobos FC", "El Salvador"));
        equipos.add(new Equipo(1, "Sonsonate FC", "El Salvador"));
        equipos.add(new Equipo(3, "CD FAS", "El Salvador"));
        equipos.add(new Equipo(5, "Municipal Limeño", "El Salvador"));
        equipos.add(new Equipo(2, "Águila", "El Salvador"));
        equipos.add(new Equipo(1, "Chalatenango FC", "El Salvador"));

        // Recorrer la colección
        for (Equipo eq : equipos) {
            System.out.println(eq.getId() + " - " +
                    eq.getNombre() + " - " +
                    eq.getPais());
        }
    }
}