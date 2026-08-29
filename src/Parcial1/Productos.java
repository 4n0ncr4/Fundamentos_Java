package Parcial1; // Programa Inventario
import java.util.Scanner;

public class Productos {
    static void main() {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.next();
        System.out.println("Nombre del producto: " + nombre);
        System.out.println();

        System.out.println("Cual es la cantidad total de productos?" );
        int cantidadProductos = scanner.nextInt();
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println();

        System.out.println("Cuantos productos caben en cada tarima? ");
        String productosTarima = scanner.next();
        System.out.println("Tarimas que caben en cada tarima: " +  productosTarima);



    }
}
