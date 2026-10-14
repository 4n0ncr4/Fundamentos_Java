package Parcial3;
import java.util.Scanner;

public class ProgramaExtra {
    static Scanner leer = new Scanner(System.in);

    static void main() {
        mostrarProceso();
    }

    static void mostrarProceso() {
        int intentos = 0;
        System.out.println("Usuario: admin");
        System.out.print("Contraseña: ");
        do {
            intentos++;
            String contrasena = leerContrasena();
            if (contrasena.equals("admin")) {
                System.out.println("Contraseña correcta, bienvenido");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("Te queda(n) " + (3 - intentos) + " intento(s)");
                if (intentos == 3) {
                    System.out.println("Fuera intruso >:(");
                    break;
                }
                System.out.print("Ingresa la contraseña nuevamente: ");
            }
        } while (true);
    }

    static String leerContrasena() {
        return leer.nextLine();
    }
}