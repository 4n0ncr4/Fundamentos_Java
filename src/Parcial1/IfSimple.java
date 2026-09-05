package Parcial1;
import java.util.Scanner;

public class IfSimple {
    static void main() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Buen día!");
        System.out.println("Eres estudiante del ITC?");
        System.out.print("Favor de responder con true / false: ");
        boolean tipoPersona = leer.nextBoolean();

        if (tipoPersona == true) {
            System.out.println("Bienvenido querido estudiante :)");
        }

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cúal es el nombre del producto? ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Qué cantidad de " +  nombreProducto + " hay disponible? ");
        int cantidadProducto = scanner.nextInt();
        scanner.close();

        if (cantidadProducto < 10) {
            System.out.println("Advertencia: Inventario Bajo");
        }
        */

    }
}
