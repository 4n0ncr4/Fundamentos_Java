package Parcial2;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysTest2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números que deseas almacenar: ");
        int cantidad = scanner.nextInt();
        int [] lista = new int [cantidad];

        System.out.println("Ingresa tus números: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + i + ": ");
            lista[i] = scanner.nextInt();
        }
        System.out.println("\nNúmeros almacenados: " + Arrays.toString(lista));

    }
}
