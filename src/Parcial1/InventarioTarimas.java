package Parcial1;
import java.util.Scanner;

public class InventarioTarimas {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.println();

        System.out.print("Cual es la cantidad total de productos?: " );
        int cantidadProductos = scanner.nextInt();
        System.out.println();

        System.out.print("Cuantos productos caben en cada tarima?: ");
        String productosTarima = scanner.next();
        System.out.println();

        System.out.println("No ideas help");


        scanner.close();
    }
}
