package Bloque3;
import java.util.LinkedList;

public class Ejercicio3LinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        listaAlumnos.add(new Alumno("A001", "Karla Perez", "CP23001"));
        listaAlumnos.add(new Alumno("A002", "Juan Lopez", "CP23002"));
        listaAlumnos.add(new Alumno("A003", "Maria Gomez", "CP23003"));

        System.out.println("LISTA DE ALUMNOS");

        for (Alumno alumno : listaAlumnos) {
            System.out.println(
                    alumno.getCodigo() + " - "
                            + alumno.getNombre() + " - "
                            + alumno.getCarnet());
        }
    }
}