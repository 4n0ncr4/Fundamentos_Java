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

        double subtotal = precio1 + precio2 + precio3; // Se calcula la suma de los items, y el resultado se guarda en la misma variable
        double impuestos = subtotal * 0.08; // Lo que se guardó en la variable subtotal se multiplica por 0.08 para sacar el valor de impuestos
        double total = subtotal + impuestos; // Se suman las variables de subtotal más los impuestos

        // En esta parte se imprimen las variables en terminal
        System.out.println("RECIBO DE TIENDA");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f\n", item1, precio1);
        System.out.printf("%s: $%.2f\n", item2, precio2);
        System.out.printf("%s: $%.2f\n", item3, precio3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Impuestos: (8%%): $%.2f\n", impuestos);
        System.out.printf("Total: $%.2f", total);

    }
}
