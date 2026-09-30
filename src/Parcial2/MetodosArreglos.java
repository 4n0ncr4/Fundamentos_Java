package Parcial2;

public class MetodosArreglos {
    static void main() {

        String [] misCanciones = {"Bohemian Rhapsody", "Hotel California", "Imagine John Lennon"};
        String [] misCanciones2 = {"Eminem"};
        leerArreglo(misCanciones);
        leerArreglo(misCanciones2);
    }

    static void leerArreglo(String[] canciones) {
        for (int i = 0; i < canciones.length; i++) {
            System.out.println(canciones[i]);
        }
    }
}
