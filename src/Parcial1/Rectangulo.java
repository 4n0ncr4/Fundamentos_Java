package Parcial1;
import java.util.Scanner; // Se importa la clase Scanner

public class Rectangulo {
    static void main() {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto de nombre "scanner"
        int ancho = scanner.nextInt(); // Se leen los datos de lo ancho
        int altura = scanner.nextInt(); // Se leen los datos de lo alto

        for (int y = 0; y < altura; y++){ // Ciclo exterior
            for (int x = 0; x < ancho; x++){ // Ciclo interior
                System.out.print("*"); // Se imprimen n números de *
            }
            System.out.println();
        }
    }
}
