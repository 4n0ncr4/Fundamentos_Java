package Parcial1;
import java.util.Scanner;

public class EntradaDatos {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Cual es tu nombre? ");
        String nombre=scanner.next();
        System.out.println("Hola " + nombre);

        System.out.print("Cuantas veces has ido al cine? ");
        int visitasCine =  scanner.nextInt();
        System.out.println("Visitas al cine: " +  visitasCine);


    }
}
