package Parcial2;
import java.util.Scanner;
import java.util.Vector;

public class EjemploVector {
    static void main() {
        Scanner leer = new Scanner(System.in);
        Vector<Double> calificaciones = new Vector<>();

        System.out.print("¿Cuántas calificaciones? ");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones.add(leer.nextDouble());
        }

        double suma = 0;
        double mayor = calificaciones.get(0);

        System.out.println("\nCalificaciones guardadas:");
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println("Posición " + i + ": " + calificaciones.get(i));
            suma += calificaciones.get(i);

            if (calificaciones.get(i) > mayor) {
                mayor = calificaciones.get(i);
            }
        }

        double promedio = suma / calificaciones.size();

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación más alta: " + mayor);
    }
}