package Parcial2;
import java.util.Scanner;

public class ProgramaExtra2 {

    static void main(){
        System.out.println(mostrarResultados());
    }

    static int leerDatos(){
        Scanner leer = new Scanner(System.in);
        int datosNumericos = leer.nextInt();
        return datosNumericos;
    }

    static String mostrarCategorias(){
        System.out.println("Bienvenido! Esta es nuestra selección de vehículos disponibles:");
        String [] categoria = {"1.- Coche Compacto", "2.- SUV Estándar", "3.- Minivan",
                "4.- SUV Premium", "5.- Furgoneta", "6.- Camión de carga"};
        for (int i = 0; i < categoria.length; i++) {
            System.out.println(categoria[i]);
        }
        return "";
    }

    static String seleccionVehiculo(){
        System.out.print("Ingresa el tipo de vehículo que desees rentar: ");
        int seleccion = leerDatos();
        while (seleccion < 1 || seleccion > 6){
            System.out.print("Vuelve a ingresar un número válido (1 - 5) para la selección del vehículo: ");
            seleccion = leerDatos();
        }
        switch(seleccion){
            case 1:
                return "El Coche compacto";
            case 2:
                return "La SUV Estándar";
            case 3:
                return "La Minivan";
            case 4:
                return "La SUV Premium";
            case 5:
                return "La Furgoneta";
            case 6:
                return "El Camión De Carga";
        }
        return "";
    }

    static String calcularPrecio(String seleccion, int precio){
        precio = 0;
        if (seleccion.contains("Coche")){
            precio = 600;
        } else if (seleccion.contains("Estándar")){
            precio = 1000;
        } else if (seleccion.contains("Minivan")){
            precio = 1600;
        } else if (seleccion.contains("Premium")){
            precio = 2000;
        } else if (seleccion.contains("Furgoneta")){
            precio = 3000;
        } else {
            precio = 4000;
        }
        return seleccion + " al día cuesta $" + precio;
    }

    static String diasRenta(String seleccion, int precio, int dias){
        System.out.print("Cuántos días vas a rentar el vehiculo?: ");
        dias = leerDatos();
        int precioFinal = dias * precio;
        return String.valueOf(precioFinal);
    }

    static String precioFinal(String calcular){
        calcular = diasRenta("ayuda", 1,1);
        return "";
    }

    static String mostrarResultados(){
        System.out.println(mostrarCategorias());
        String seleccion = seleccionVehiculo();
        String calcular = calcularPrecio(seleccion, 1);
        System.out.println(calcular);
        System.out.println(diasRenta("El precio final es: ", 1,1));
        return "";
    }
}
