package Parcial1;
import java.util.Scanner;

public class Prueba {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas horas estuvo aqui mijo? ");
        int horas = sc.nextInt();
        int tarifa = 0;

        if (horas <= 2){
            tarifa = 30;
            System.out.println("La tarifa es: " + tarifa);
        } else {
            tarifa = 50;
            System.out.println("La tarifa es: " + tarifa);
        }
    }
}
