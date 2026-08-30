package Parcial1;

public class reciboTienda {
    static void main() {

        // Se declaran las variables
        String item1 = "Playera";
        String item2 = "Pantalones";
        String item3 = "Gorra";
        double precio1 = 499.99;
        double precio2 = 199.99;
        double precio3 = 99.99;

        // Se calcula el total
        double subtotal = precio1 + precio2 + precio3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;

        // En esta parte se imprimen las variables en terminal
        System.out.println("RECIBO DE TIENDA");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f\n", item1, precio1);
        System.out.printf("%s: $%.2f\n", item2, precio2);
        System.out.printf("%s: $%.2f\n", item3, precio3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Impuestos: (8%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f", total);

    }
}
