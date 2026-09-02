package Parcial1;
import java.util.Scanner;

public class condicionales {
    static void main() {

        // Retiro de saldo
        Scanner leer = new Scanner(System.in);
        double saldo = 4000.0, retiro;
        System.out.print("No lo haga joven, cuanto va a retirar :(? ");
        retiro = leer.nextDouble();
        if (retiro <= saldo && retiro > 0){
            saldo = saldo - retiro;
            //saldo -= retiro;
            System.out.println("Saldo nuevo pobre es: " + saldo);
        } else {
            System.out.println("Pobre saldo insuficiente, trabaja");
        }


        System.exit(0);
        int edad = 23;
        if (edad >= 18){
            System.out.println("Puedes jugar: GTA 6, RE7, Silent Hill 2");
        } else {
            System.out.println("Puedes jugar: Canicas, Minecraft, Barbies, Carritos, Tazos");
        }
    }
}