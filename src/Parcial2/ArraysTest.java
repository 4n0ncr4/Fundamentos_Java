package Parcial2;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Números (pares) o (impares)? ");
        String seleccion = scanner.nextLine();

        int [] numerosPares = {6, 2, 10, 4, 8, 12};
        int [] numerosImpares = {5, 1, 9, 3, 7, 11};

        Arrays.sort(numerosPares);
        Arrays.sort(numerosImpares);

        if (seleccion.equals("pares")) {
            System.out.println(Arrays.toString(numerosPares));
        } else if (seleccion.equals("impares")) {
            System.out.println(Arrays.toString(numerosImpares));
        } else {
            System.out.println("Elige entre (pares) o (impares)");
        }


    }
}