package Parcial2;
import java.util.Scanner;

public class WhileTarea {
    static void main() {
        mostrarMenu();
    }

    static String mostrarMenu(){
        String [] menu = {"1. Respaldar un archivo", "2. Ver avance", "3. Cancelar"};
            for (int i = 0; i < menu.length; i++){
                System.out.println(menu[i]);
            }
            System.out.println("");
            leerDatos();
        return "";
    }

    static int leerDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        int opcion = leer.nextInt();
        while (opcion < 1 || opcion > 3){
            opcion = leerDatos();
        }
        return opcion;
    }

    static int archivosRespaldados(){
        int respaldo = leerDatos();
        return respaldo;
    }

}
