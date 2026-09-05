package Parcial1;
import java.util.Scanner;

public class EstructurasControl {
    static void main() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Cuanto aura tienes? ");
        int aura = leer.nextInt();
        System.out.print("Tienes memorias?");
        boolean tienesMemorias = leer.nextBoolean();
        if (aura >= 100 && tienesMemorias == false){
            System.out.println("Bienvenido a tu primer startup");
        } else {
            System.out.println("No puedes pasar");
        }

        System.exit(0);

        System.out.println(10 > 3);
        System.out.println(10 < 3);
        System.out.println(10 == 3);
        System.out.println(3 == 3);

    }
}
