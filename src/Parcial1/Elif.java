package Parcial1;
import java.util.Scanner;

public class Elif {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cúal es el nombre del producto? ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Cuál es la cantidad de " +  nombreProducto + " disponible? ");
        int cantidadProducto = scanner.nextInt();

        if (cantidadProducto >= 50) {
            System.out.println("Inventario alto");
        } else if (cantidadProducto <= 49 && cantidadProducto >= 20) {
            System.out.println("Inventario medio");
        } else if (cantidadProducto <= 19 && cantidadProducto >= 1){
            System.out.println("Inventario bajo");
        } else {
            System.out.println("Producto agotado");
        }

                /* (PROGRAMA EXTRA)
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("         SERIES DE TV         ");
        System.out.println("------------------------------");
        System.out.println("          Categorías:         ");
        System.out.println("1.- Drama Médico");
        System.out.println("2.- Suspenso/Acción");
        System.out.println("3.- Drama Psicológico");
        System.out.println("4.- Fantasía");
        System.out.println("5.- Comedia");
        System.out.println("------------------------------");
        System.out.print("Qué tipo de serie te gusta? ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Se encuentran series como:");
            System.out.println("The Pitt, House, Grey's Anatomy, The Good Doctor, ER");
        } else if (opcion == 2) {
            System.out.println("Se encuentran series como:");
            System.out.println("Breaking Bad, Dexter, Prison Break, True Detective, The Mentalist");
        }  else if (opcion == 3) {
            System.out.println("Se encuentran series como:");
            System.out.println("Black Mirror, Dark, Six Feet Under, Mr. Robot, The Leftovers");
        }  else if (opcion == 4) {
            System.out.println("Se encuentran series como:");
            System.out.println("Stranger Things, Game of Thrones, The Mandalorian, The Expanse, Westworld");
        }   else if (opcion == 5) {
            System.out.println("Se encuentran series como:");
            System.out.println("The Office, Friends, The Big Bang Theory, Modern Family, Los Simpsons");
        } else {
            System.out.println("Por favor, elija otra opción que esté disponible");
        }
        */

        /* EJERCICIOS DE CLASE
        Scanner leer = new Scanner(System.in);
        String tipoAmor;
        System.out.println("Descubre la verdad amigo no cierres los ojos");
        tipoAmor = leer.next();
        if (tipoAmor.equals("Te ama")) {
            System.out.println("Te ama");
        } else if (tipoAmor.equals("Te quiere")) {
            System.out.println("Te quiere");
        } else if (tipoAmor.equals("Le gustas")) {
            System.out.println("Le gustas");
        } else {
            System.out.println("ERES UN JUGUETE");
        }

        System.exit(0);

        System.out.println("1 Debito 2 Credito, 3 Efectivo");
        int opcion = leer.nextInt();

        if (opcion == 1) {
            System.out.println("Guarda dinero y transferencia");
            System.out.println("Clonar tarjeta");
            System.out.println("Vaciar dinero");
            System.out.println("Robar identidad");
            System.out.println("No generas historial crediticio");
        } else if (opcion == 2) {
            System.out.println("Generas historial crediticio");
            System.out.println("Puntos");
            System.out.println("Cashback");
        } else if (opcion == 3) {
            System.out.println("Descapitalizacion");
        } else {
            System.out.println("Opcion no valida");
        }

         */
    }
}


// 100 lineas lol