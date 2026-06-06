package bloque2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Ejemplo3ArrayListVsLinkedList {
    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<>();
        List<Persona> listaLinked = new LinkedList<>();
        long antes;

        for (int i = 0; i <= 10000; i++) {
            listaArray.add(new Persona(i, "Persona " + i, "Tel." + i));
            listaLinked.add(new Persona(i, "Persona " + i, "Tel." + i));
        }

        System.out.println("Tiempo en insertar una Persona en ArrayList");
        antes = System.nanoTime();
        listaArray.add(0, new Persona(10001, "Prueba inicio", "000000"));
        System.out.println(System.nanoTime() - antes);

        System.out.println("");
        System.out.println("Tiempo en insertar una Persona en LinkedList");
        antes = System.nanoTime();
        listaLinked.add(0, new Persona(10001, "Prueba inicio", "000000"));
        System.out.println(System.nanoTime() - antes);

        System.out.println("");
        System.out.println("Tiempo en insertar en ArrayList al centro");
        antes = System.nanoTime();
        listaArray.add(5000, new Persona(10002, "Prueba centro", "000000"));
        System.out.println(System.nanoTime() - antes);

        System.out.println("");
        System.out.println("Tiempo en insertar en LinkedList al centro");
        antes = System.nanoTime();
        listaLinked.add(5000, new Persona(10002, "Prueba centro", "000000"));
        System.out.println(System.nanoTime() - antes);
    }
}


class Persona {

    private int id;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Persona other = (Persona) obj;

        if (this.id != other.id && !Objects.equals(this.nombre, other.nombre)) {
            return false;
        }

        return true;
    }
}
