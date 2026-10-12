package Parcial3;
import java.util.Scanner;

public class DoWhileTest {
    static void main() {

        System.out.print("Elige una opción del 1 al 3: ");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        do {
            if (opcion == 1) {
                System.out.println("opcion 1");
            } else if (opcion == 2) {
                System.out.println("opcion 2");
            }else if (opcion == 3) {
                System.out.println("opcion 3");
            } else {
                System.out.println("opcion no valida");
            }
        } while (opcion != 3);

    }
}
