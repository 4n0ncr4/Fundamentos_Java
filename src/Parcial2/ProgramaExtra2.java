package Parcial2;
import java.util.Scanner;

public class ProgramaExtra2 {
    static Scanner leer = new Scanner(System.in);
    static String [] categoria = {"Coche Compacto", "SUV Estándar", "Minivan",
            "SUV Premium", "Furgoneta", "Camión de carga"};
    static int [] precios = {600, 1000, 1600, 2000, 3000, 4000};

    static void main(){
        mostrarCategorias();
        int indice = seleccionVehiculo();
        int dias = diasRenta();
        mostrarResultados(indice, dias);
    }

    static int leerDatos(){
        return leer.nextInt();
    }

    static void mostrarCategorias(){
        System.out.println("Bienvenido! Esta es nuestra selección de vehículos disponibles:");
        for (int i = 0; i < categoria.length; i++) {
            System.out.println((i + 1) + ".- " + categoria[i] + " $" + precios[i] + " al día");
        }
    }

    static int seleccionVehiculo(){
        System.out.print("Ingresa el tipo de vehículo que desees rentar: ");
        int seleccion = leerDatos();
        while (seleccion < 1 || seleccion > 6){
            System.out.print("Vuelve a ingresar un número válido (1 - 6) para la selección del vehículo: ");
            seleccion = leerDatos();
        }
        return seleccion;
    }

    static int diasRenta(){
        System.out.print("Cuántos días vas a rentar el vehiculo?: ");
        int dias = leerDatos();
        while (dias < 1){
            System.out.println("Vuelve a ingresar el número de días (Mayor a 1)");
            dias = leerDatos();
        }
        return dias;
    }

    static int calcularPrecio(int indice, int dias){
        return precios[indice] * dias;
    }

    static void mostrarResultados(int indice, int dias){
        int total = calcularPrecio(indice, dias);
        System.out.println("Vehículo: " + categoria[indice]);
        System.out.println("Precio al día: " + precios[indice]);
        System.out.println("Días: " + dias);
        System.out.println("Monto total: $" + total);
    }
}