package Parcial3;
import java.util.Scanner;

public class SwitchTarea {
    static Scanner leer = new Scanner(System.in);
    static void main() {

        String [] recetas = {"Pizza", "Hamburguesas", "Alitas", "Boneless"};
        for  (int i = 0; i < recetas.length; i++) {
            System.out.println((i + 1) + ".- " +  recetas[i]);
        }
        System.out.print("Ingresa el platillo que más te guste: ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                String[] categoriasPizza = {"Pizza de Pepperoni", "Pizza Hawaiana",
                        "Pizza de Queso", "Pizza con champiñones"};
                for (int j = 0; j < categoriasPizza.length; j++) {
                    System.out.println((j + 1) + ".- " + categoriasPizza[j]);
                }
                System.out.print("Ingresa la categoría que más te guste: ");
                int categoria = leer.nextInt();
                switch (categoria) {
                    case 1:
                        System.out.println(categoriasPizza[0] + " $120");
                        break;
                    case 2:
                        System.out.println(categoriasPizza[1] + " $150");
                        break;
                    case 3:
                        System.out.println(categoriasPizza[2] + " $100");
                        break;
                    case 4:
                        System.out.println(categoriasPizza[3] + " $180");
                }
            case 2:
                String[] categoriasHamburguesas = {"Hamburguesa de Queso", "Hamburguesa de doble carne",
                        "Hamburguesa Vegetariana", "Hamburguesa con Tocino"};
                for (int j = 0; j < categoriasHamburguesas.length; j++) {
                    System.out.println((j + 1) + ".- " + categoriasHamburguesas[j]);
                }
                System.out.print("Ingresa la categoría que más te guste: ");
                int categoria2 = leer.nextInt();
                switch (categoria2) {
                    case 1:
                        System.out.println(categoriasHamburguesas[0] + " $200");
                        break;
                    case 2:
                        System.out.println(categoriasHamburguesas[1] + " $300");
                        break;
                    case 3:
                        System.out.println(categoriasHamburguesas[2] + " $250");
                        break;
                    case 4:
                        System.out.println(categoriasHamburguesas[3] + " $275");
                        break;
                }
            case 3:
                String[] categoriasAlitas = {"Alitas con BBQ", "Alitas con Salsa Búffalo",
                        "Alitas con Barbacoa", "Alitas con Queso"};
                for (int j = 0; j < categoriasAlitas.length; j++) {
                    System.out.println((j + 1) + ".- " + categoriasAlitas[j]);
                }
                System.out.print("Ingresa la categoría que más te guste: ");
                int categoria3 = leer.nextInt();
                switch (categoria3) {
                    case 1:
                        System.out.println(categoriasAlitas[0] + " $200");
                        break;
                    case 2:
                        System.out.println(categoriasAlitas[1] + " $250");
                        break;
                    case 3:
                        System.out.println(categoriasAlitas[2] + " $300");
                        break;
                    case 4:
                        System.out.println(categoriasAlitas[3] + " $250");
                        break;
                }
            case 4:
                String[] categoriasBoneless = {"Boneless con BBQ", "Boneless con Salsa Búffalo",
                        "Boneless con Barbacoa", "Boneless con Queso"};
                for (int j = 0; j < categoriasBoneless.length; j++) {
                    System.out.println((j + 1) + ".- " + categoriasBoneless[j]);
                }
                System.out.print("Ingresa la categoría que más te guste: ");
                int categoria4 = leer.nextInt();
                switch (categoria4) {
                    case 1:
                        System.out.println(categoriasBoneless[0] + " $250");
                        break;
                    case 2:
                        System.out.println(categoriasBoneless[1] + " $300");
                        break;
                    case 3:
                        System.out.println(categoriasBoneless[2] + " $350");
                        break;
                    case 4:
                        System.out.println(categoriasBoneless[3] + " $300");
                        break;
                }
        }
    }
}
