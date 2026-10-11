package Parcial2;
import java.util.Scanner;

public class WhileTarea {
    static int totalArchivos = 5;
    static Scanner leer = new Scanner(System.in);

    static void main() {
        mostrarProceso();
    }

    static void mostrarProceso(){
        int respaldados = 0;
        while (faltanArchivos(respaldados)){
            mostrarMenu();
            int opcion = leerOpcion();
            if (opcion == 1) {
                respaldados = respaldarArchivo(respaldados);
            } else if (opcion == 2) {
                verAvance(respaldados);
            } else if (opcion == 3) {
                System.out.println("Respaldo cancelado");
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
        if (!faltanArchivos(respaldados)) {
            System.out.println("Respaldo listo");
        }
    }

    static boolean faltanArchivos(int respaldados) {
        return respaldados < totalArchivos;
    }

    static void mostrarMenu(){
        System.out.println("1. Respaldar un archivo");
        System.out.println("2. Ver avance");
        System.out.println("3. Cancelar");
        System.out.print("Elige una opción: ");
    }

    static int leerOpcion(){
        return leer.nextInt();
    }

    static int respaldarArchivo(int respaldados){
        respaldados++;
        System.out.println("Archivo respaldado. Total: " + respaldados);
        return respaldados;
    }

    static void verAvance(int respaldados){
        System.out.println("Archivos respaldados: " + respaldados + " de " + totalArchivos);
    }
}