package Parcial3;
import java.util.Arrays;

public class Peliculas {

    String titulo;
    double duracion;
    int anioPublicacion;
    String genero;
    String [] actores;

    void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion);
        System.out.println("Año Publicación: " + anioPublicacion);
        /*
        for (int i = 0; i < actores.length; i++){
            System.out.println("Actor: " + actores[i]);
        }
         */
        System.out.println("Actores: " + Arrays.toString(actores));
        System.out.println("Género: " + genero);
    }
}
