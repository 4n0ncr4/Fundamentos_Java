package Parcial2;

public class While {
    static void main() {

        int cantidadBateria = 0;
        while (cantidadBateria < 100) {
            cantidadBateria += 20;
        }
        System.out.println(cantidadBateria);

        int archivo = 0;
        while (archivo < 3) {
            archivo++;
            System.out.println("Archivos" +  archivo);
        }

        int peticiones = 0;
        boolean activo = true;
        while (activo && peticiones < 3) {
            peticiones++;
            System.out.println("Petición" +  peticiones);
        }


    }
}
