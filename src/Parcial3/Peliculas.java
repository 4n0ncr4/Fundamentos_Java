package Parcial3;
import java.util.Arrays;

public class Peliculas {

    String titulo;
    double duracion;
    int anioPublicacion;
    String genero;
    String [] actores;
    int calificacion = 0;

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


    int mostrarInfo(int calificacion){
        calificacion = 100;

        String s = calificacion <= 100 && calificacion >= 90
                ? "Excelente, sigue así" :
                calificacion <= 89 && calificacion >= 80
                        ? "Muy bien" :
                        calificacion <= 79 && calificacion >= 70
                                ? "Se puede mejorar" :
                                "Reprobado, practica más";
        return calificacion;
        
        
        
    /*    
    Peliculas(String tituloCons, double duracion){
        this.titulo = tituloCons;
        this.duracion = duracion;
     */
    }

}
