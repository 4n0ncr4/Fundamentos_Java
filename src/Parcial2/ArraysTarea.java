package Parcial2;
import java.util.Scanner;

public class ArraysTarea {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        String [] elementos = {"PostgreSQL", "MongoDB", "InfluxDB", "MySQL",
        "Redis", "Prometheus", "SAP HANA", "Cassandra", "Oracle", "OpenTSDB"}; // Arreglo definido
        String [] clasificacion = new String[elementos.length]; // Arreglo de 10 espacios ya definido

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Cuál es la clasificación de " +  elementos[i] + "?");
            System.out.println("Relacional, No Relacional, Series Temporales");
            System.out.print("= ");
            String leer = scanner.nextLine(); // Lectura desde el Scanner (leer)
            if (leer.equalsIgnoreCase("Relacional") ||  leer.equalsIgnoreCase("No Relacional") || leer.equalsIgnoreCase("Series Temporales")) {
                clasificacion[i] = leer; // Se guardan la lectura en el arreglo "clasificacion"
            } else {
                clasificacion[i] = "[Categoría No Válida]";
            }
        }

        for (int j = 0; j < elementos.length; j++) {
            System.out.println((j + 1) + ".- " + elementos[j] + " - " + clasificacion[j]);
        }
    }
}