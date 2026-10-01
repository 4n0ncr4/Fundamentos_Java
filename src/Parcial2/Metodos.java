package Parcial2;
import java.util.Scanner;

public class Metodos {

    static int leerPorcentaje (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar % de uso del procesador");
        int porcentaje =  leer.nextInt();
        return porcentaje;
    }

    // static int evaluarProeeso(){}

    static void main() {
        System.out.println("Reporte: ");
        leerPorcentaje();

    }
}
