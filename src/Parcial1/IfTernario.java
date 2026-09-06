package Parcial1;
import java.util.Scanner;

public class IfTernario {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuál es el nombre del producto? ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Qué cantidad de " +  nombreProducto + " hay disponible? ");
        int cantidadDisponible = scanner.nextInt();

        String disponibilidad = cantidadDisponible > 0 ? "Disponible" : "Agotado";
        System.out.println(disponibilidad);

        /* (PROGRAMA EXTRA)
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuál fue tu calificación este parcial? ");
        int calificacion = sc.nextInt();

        if (calificacion < 0 || calificacion > 100){
            System.out.println("Favor de ingresar un número válido");
        } else {
            String rangoCalificaciones =
                    calificacion <= 100 && calificacion >= 90
                    ? "Excelente, sigue así" :
                    calificacion <= 89 && calificacion >= 80
                    ? "Muy bien" :
                    calificacion <= 79 && calificacion >= 70
                    ? "Se puede mejorar":
                    "Reprobado, practica más";
            System.out.println(rangoCalificaciones);
        }
        */

        /* EJERCICIOS DE CLASE
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame tu password: ");
        String password = leer.nextLine();
        String buenaContraseña = password.length() >= 8 ? "Buena contraseña" : "Mala contraseña";
        System.out.println(buenaContraseña);

        System.exit(0);

        String tipo = leer.nextLine();
        String serie = (tipo.equals("anime")) ? "Los 7 pecados capitales" : "Supernatural";
        System.out.println(serie);
        */

    }
}