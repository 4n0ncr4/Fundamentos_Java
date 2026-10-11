package Parcial2;
import java.util.Scanner;

public class ProgramaExtra3 {
    static int meta = 500;
    static Scanner leer = new Scanner(System.in);

    static void main() {
        iniciarAhorro();
    }

    static void iniciarAhorro() {
        int ahorro = 0;
        while (faltaPorAhorrar(ahorro)) {
            mostrarMenu();
            int opcion = leer.nextInt();
            if (opcion == 1) {
                ahorro = depositar(ahorro);
            } else if (opcion == 2) {
                verAhorro(ahorro);
            } else if (opcion == 3) {
                System.out.println("Saliste sin llegar a la meta");
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
        if (!faltaPorAhorrar(ahorro)) {
            System.out.println("¡Meta alcanzada!");
        }
    }

    static boolean faltaPorAhorrar(int ahorro) {
        return ahorro < meta;
    }

    static void mostrarMenu() {
        System.out.println("1. Depositar dinero");
        System.out.println("2. Ver ahorro");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    static int depositar(int ahorro) {
        System.out.print("¿Cuánto quieres depositar? $");
        int monto = leer.nextInt();
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0");
            return ahorro;
        }
        ahorro += monto;
        System.out.println("Depósito exitoso. Ahorro actual: $" + ahorro);
        return ahorro;
    }

    static void verAhorro(int ahorro) {
        System.out.println("Llevas $" + ahorro + " de $" + meta);
    }
}