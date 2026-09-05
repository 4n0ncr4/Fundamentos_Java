package Parcial1;
import java.util.Scanner; // Se importa la clase Scanner

public class InventarioTarimas {
    static void main() {

        Scanner scanner = new Scanner(System.in); // Se crea el objeto para la lectura de datos

        //Recolección de datos por medio del Scanner

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Cuál es la cantidad total de productos? ");
        int cantidadProductos = scanner.nextInt();

        System.out.print("Cuántos productos de " + nombre + " caben en cada tarima? ");
        int productosTarima = scanner.nextInt();
        System.out.println();

        scanner.close(); // Se cierra el objeto Scanner

        // Variables donde se guardan los cálculos de las tarimas completas y la cantidad de productos restantes

        int tarimasCompletas = cantidadProductos / productosTarima;
        int productosRestantes = cantidadProductos - (tarimasCompletas * productosTarima);

        // Esta es la impresión completa del reporte final

        System.out.println("------------------------------------------");
        System.out.println("            Reporte de Tarimas            ");
        System.out.println("------------------------------------------");
        System.out.println("Producto: " + nombre);

        /* Bloques de condiciones un poco innecesarios, lo sé, pero quería probar más con las decisiones y de paso
        cambiar el mensaje si se cumplía la condición donde la cantidad de productos / tarimas fuera igual a 1 :D
        */

        if (cantidadProductos == 1 && productosTarima == 1) {
            System.out.println("Cantidad total de " + nombre + ": " + cantidadProductos + " unidad");
        } else {
            System.out.println("Cantidad total de " + nombre + ": " + cantidadProductos + " unidades");
        }

        if (cantidadProductos == 1 && productosTarima == 1) {
            System.out.println(cantidadProductos + " unidad de " + nombre + " cabe en " + productosTarima + " tarima");
        } else {
            System.out.println(cantidadProductos + " unidades de " + nombre + " caben en " + productosTarima + " tarimas");
        }

        if (tarimasCompletas == 1 && productosTarima == 1) {
            System.out.println("Se puede llenar un total de " +  tarimasCompletas + " tarima");
        } else {
            System.out.println("Se pueden llenar un total de " +  tarimasCompletas + " tarimas");
        }

        if (productosRestantes == 1){
            System.out.println("Quedó " + productosRestantes + " producto restante sin tarima");
        } else {
            System.out.println("Quedaron " + productosRestantes + " productos restantes sin tarima");
        }

        System.out.println("------------------------------------------");
    }
}