package bloque2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1AlmacenarDetenerCalcular {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        String respuesta;

        do {
            System.out.println("Ingrese un numero: ");
            double numero = teclado.nextDouble();

            numeros.add(numero);

            System.out.println("¿Desea ingresar otro número? (s/n): ");
            respuesta = teclado.next();
        }
        while (respuesta.equalsIgnoreCase("s"));

        double suma = 0;
        int positivos = 0;

        for (double num : numeros){
            suma += num;

            if (num > 0){
                positivos++;
            }
        }

        double promedio = suma / numeros.size();

        System.out.println("\nCantidad de números ingresados: " + numeros.size());
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de números positivos: " + positivos);

        teclado.close();
    }
}
