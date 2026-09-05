package Parcial1;
import java.util.Scanner;

public class IfElse {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Comprar ELDEN RING");
        System.out.print("Cuánto dinero tienes en disposición? $");
        double dinero = sc.nextDouble(); // Lectura de datos, tipos de datos double
        double precioJuego = 979.00; // Sí, está muy caro D:

        if (dinero >= precioJuego) {
            System.out.println("Gracias por tu compra!");
            System.out.println("Disfruta de el juego :D");
            dinero -= precioJuego; // Se resta el precioJuego a dinero, y se almacena en la variable dinero
            System.out.printf("Te quedaron %.2f pesos restantes", dinero);
        } else {
            System.out.println("No te alcanza :(, trabaja");
            precioJuego -= dinero; /* Se resta el dinero a precioJuego para calcular la diferencia
                                    y se almacena en la variable precioJuego */
            System.out.printf("Te faltan %.2f pesos para comprar el juego", precioJuego);
        }


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cúal es el nombre del producto? ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Qué cantidad de " +  nombreProducto + " desea? ");
        int cantidadProducto = scanner.nextInt();

        System.out.print("Qué cantidad de " +  nombreProducto + " hay disponible? ");
        int cantidadDisponible = scanner.nextInt();

        if (cantidadDisponible > cantidadProducto) {
            System.out.println("Venta autorizada");
        } else {
            System.out.println("Producto insuficiente");
        }
         */

        /* EJERCICIOS DE CLASE
        Scanner leer = new Scanner(System.in);
        System.out.print("Cuanto aura tienes? ");
        int aura = leer.nextInt();
        System.out.print("Tienes memorias?");
        boolean tienesMemorias = leer.nextBoolean();
        if (aura >= 100 && tienesMemorias == false){
            System.out.println("Bienvenido a tu primer startup");
        } else {
            System.out.println("No puedes pasar");
        }

        System.exit(0);

        System.out.println(10 > 3);
        System.out.println(10 < 3);
        System.out.println(10 == 3);
        System.out.println(3 == 3);
        */
    }
}
