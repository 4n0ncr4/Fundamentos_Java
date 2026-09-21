package Parcial2;
import java.util.Scanner;

public class ArraysTarea {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        String [] elementos = {"PostgreSQL", "MongoDB", "InfluxDB", "MySQL",
        "Redis", "Prometheus", "SAP HANA", "Cassnadra", "Orcale", "OpenTSDB"}; // Arreglo definido
        String [] clasificacion = new String[10]; // Arreglo de 10 espacios ya definido

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Cuál es la clasificación de " +  elementos[i] + "?");
            System.out.println("Relacional, No Relacional, Series temporales");
            System.out.print("= ");
            String leer = scanner.nextLine(); // Lectura desde el Scanner (leer)
            clasificacion[i] = leer; // Se guardan la lectura en el arreglo "clasificacion"
        }

        for (int j = 0; j < elementos.length; j++) {
            System.out.println((j + 1) + ".- " + elementos[j] + " es " + clasificacion[j]);
        }
        System.out.println("hola git");
    }
}