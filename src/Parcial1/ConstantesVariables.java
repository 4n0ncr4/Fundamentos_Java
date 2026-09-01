package Parcial1;

public class ConstantesVariables {
    static void main() {
        int salario = 0; // Salario actual
        double saldoBanco = 66.77; // Variable con valor que puede ser modifcado
        final double IVA = 0.16; // Constante con valor que no se puede cambiar

        int cantidadProductos = 24;
        double precioProducto = 230.0;

        double subTotal = cantidadProductos * precioProducto;
        double impuesto = subTotal * IVA;
        double total = impuesto + subTotal;
        System.out.println("Cantidad Productos: "+cantidadProductos);
        System.out.println("Precio: "+precioProducto);
        System.out.println("subTotal: "+ subTotal );
        System.out.println("Total: "+total);

        System.out.println(salario);
        salario = 4_000;
        System.out.println(salario);
        salario = 12_000;
        System.out.println(salario);
        salario = 30_000;
        System.out.println(salario);

        String nombreCompleto = "Javier Alejandro Ramírez Cruz";
        String tituloDePelicula = "El Señor de los Anillos";
        String sistemaOperativo = "MacOS";
        String correoInstitucional = "26030344@itcelaya.edu.mx";

    }
}
