package Parcial2;
import java.util.Scanner;

public class RespuestaDeAmor {
    static void main() {

        Scanner leer  = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("Quieres ser mi novia?");
            System.out.println("1.- Si 2.- No");
            respuesta = leer.nextInt();
            if (respuesta == 2) {
                System.out.println("Error 404: Respuesta no aceptada XD");
            }
        } while (respuesta != 1);

        System.out.println("Commit del amor aprobado <3");
        leer.close();

    }
}
