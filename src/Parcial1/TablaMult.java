package Parcial1;
import java.util.Scanner; // Se importa la clase Scanner

public class TablaMult {
    static void main() {

        Scanner scanner = new Scanner(System.in); // Se crea el objeto para la lectura de datos

        System.out.print("De qué número quieres que sea la Tabla de Multiplicar? ");
        int numero = scanner.nextInt();
        int suma = 0;
        scanner.close(); // Se cierra el objeto Scanner

        System.out.println("----------------------------------");
        System.out.println("Tabla de Multiplicar del " + numero);
        System.out.println("----------------------------------");

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            suma += resultado;
        }

        System.out.println("----------------------------------");
        System.out.println("Suma de todos los resultados: " + suma);
        System.out.println("----------------------------------");
    }
}
