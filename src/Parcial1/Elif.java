package Parcial1;
import java.util.Scanner;

public class Elif {
    static void main() {
        Scanner leer = new Scanner(System.in);

        System.out.println("1 Debito 2 Credito, 3 Efectivo");
        int opcion = leer.nextInt();

        if (opcion == 1) {
            System.out.println("Guarda dinero y transferencia");
            System.out.println("Clonar tarjeta");
            System.out.println("Vaciar dinero");
            System.out.println("Robar identidad");
            System.out.println("No generas historial crediticio");
        } else if (opcion == 2) {
            System.out.println("Generas historial crediticio");
            System.out.println("Puntos");
            System.out.println("Cashback");
        } else if (opcion == 3) {
            System.out.println("Descapitalizacion");
        } else {
            System.out.println("Opcion no valida");
        }
    }
}