package Parcial3;
import java.util.Scanner;

public class DoWhileTarea {
    static Scanner leer = new Scanner(System.in);
    static boolean estado;

    static void main() {
        mostrarProceso();
    }

    static int leerOpcion(){
        return leer.nextInt();
    }

    static void mostrarMenu(){
        System.out.println("1.- Probar conexión");
        System.out.println("2.- Ver estado");
        System.out.println("3.- Cancelar");
    }

    static void mostrarProceso(){
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            int opcion = leerOpcion();
            if (opcion == 1) {
                byte parametro = 0;
                actualizarEstado(parametro);
                if (estado == true){
                    System.out.println("Servidor conectado");
                    break;
                } else {
                    System.out.println("Servidor no conectado");
                }
            } else if (opcion == 2) {
                if (estado == false){
                    System.out.println("Estado del servidor: " + estadoConexion() + " (no conectado)");
                }
                continue;
            } else if (opcion == 3) {
                System.out.println("Prueba cancelada");
                break;
            } else {
                System.out.println("Opción no válida");
            }
        } while (estado == false);
    }

    static boolean estadoConexion() {
        return estado;
    }

    static byte actualizarEstado(byte nuevoEstado){
        System.out.print("Elige un nuevo estado (0 o 1): ");
        nuevoEstado = leer.nextByte();
        if (nuevoEstado == 0) {
            estado = false;
        } else if (nuevoEstado == 1) {
            estado = true;
        } else {
            System.out.println("Opción no válida");
        }
        return nuevoEstado;
    }
}