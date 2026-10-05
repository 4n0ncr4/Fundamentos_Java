package Parcial2;
import java.util.Scanner;

public class ProgramaExtra2 {

    static String mostrarCategorias(){
        System.out.println("Bienvenido! Esta es nuestra selección de vehículos:");
        String [] categoria = {"1.- Coche Compacto", "2.- SUV Estándar", "3.- Minivan",
                                "4.- SUV Premium", "5.- Furgoneta", "6.- Camión de carga"};
        for  (int i = 0; i < categoria.length; i++) {
            System.out.println(categoria[i]);
        }
        return "";
    }

    static String seleccionVehiculo(int precio){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el tipo de vehículo que desees: ");
        precio = leer.nextInt();
        switch(precio){
            case 1:
                return "El coche compacto al día cuesta: $600";
            case 2:
                return "La SUV Estándar al día cuesta: $1000";
            case 3:
                return "La Minivan al día cuesta: $1600";
            case 4:
                return "La SUV Premium al día cuesta: $2000";
            case 5:
                return "La Furgoneta al día cuesta: $3000";
            case 6:
                return "El Camión de carga cuesta: $4000";
        }
        return "";
    }

    static void main(){
        System.out.println(mostrarCategorias());
        System.out.println(seleccionVehiculo(0));
    }
}
