package Parcial3;

public class TryCatch {
    static void main() {

        int balas = 12;
        int jugadores = 0;

        try {
            int reparto = balas / jugadores;
            System.out.println(reparto);
        } catch (ArithmeticException e) {
            System.out.println("Error: division entre cero");
        }
        System.out.println("La misión continua");

        /*
        int[] baterias = {80, 40};

        try {
            System.out.println(baterias[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("La grabación continua");
         */

    }
}