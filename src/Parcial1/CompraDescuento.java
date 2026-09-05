package Parcial1;
import java.util.Scanner; // Se importa la clase Scanner

public class CompraDescuento {
    static void main() {

        Scanner scanner = new Scanner (System.in); // Se crea el objeto de la clase Scanner
        System.out.println("   Bienvenido!  " );
        System.out.println("-----------------");
        System.out.println("Ingrese su edad: ");

        int edad = scanner.nextInt(); // Aquí se pide ingresar la edad de el usuario
        double precio = 100; // Este es el precio determinado del producto

        if (edad < 18) // En este bloque de decisión si la edad es menor de 18 se descuenta un 20% al producto
        {
            precio -= 20;
            System.out.printf("El total es: $%.2f\n", precio);
        }
        else if (edad >= 60) // Este otro bloque de decisión si la edad es mayor o igual a 60 se le descuenta un 40% al producto
        {
            precio -= 40;
            System.out.printf("El total es: $%.2f\n", precio);
        }
        else // Si las dos condiciones no se cumplen, entra a este otro bloque y no se le aplica el descuento al producto
        {
            System.out.printf("El total es: $%.2f\n", precio);
        }
        System.out.println("Disfrute la función! ");
        scanner.close(); // Se finaliza el proceso del Scanner
    }
}
