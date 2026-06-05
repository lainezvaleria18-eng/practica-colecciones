package Bloque3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class  Ejemplo36ColeccionHashSet {

    public static void main(String[] args) {

        // Declarar la colección
        Set lista = new HashSet();

        lista.add("hola");
        lista.add(2525);
        lista.add(3.1416);
        lista.add(true);
        lista.add(2525); // este elemento no será agregado

        // Recorre la lista para mostrar el contenido
        Iterator it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Declarar segunda lista
        HashSet<String> lista1 = new HashSet<>();

        lista1.add("hola");
        lista1.add("333");
        lista1.add("programadores");
        lista1.add("que tal?");
        lista1.add("333"); // este elemento no será agregado
        lista1.add("saludos");

        System.out.println("");
        System.out.println("//////////// LISTA 2 ////////////");

        for (String el : lista1) {
            System.out.println(el);
        }

        System.out.println("");
        System.out.println("//////////// LISTA 3 ////////////");

        HashSet<Persona> personas = new HashSet<>();

        personas.add(new Persona(1, "Juan Perez", "7852-9658"));
        personas.add(new Persona(2, "Juan Martinez", "7852-9658"));
        personas.add(new Persona(3, "Juan Salgado", "7852-9658"));
        personas.add(new Persona(4, "Juan Sosa", "7852-9658"));
        personas.add(new Persona(1, "Juan Aguilera", "7852-9658"));

        System.out.println("");

        for (Persona per : personas) {
            System.out.println(
                    per.getId() + " "
                            + per.getNombre() + " "
                            + per.getTelefono());
        }
    }
}

class Persona {

    private int id;
    private String nombre;
    private String telefono;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Persona otra = (Persona) obj;

        return id == otra.id;
    }
}