package Parcial3;


public class Main2 {
    static void main() {

        Peliculas peliculita = new Peliculas();
        peliculita.titulo = "Bambi";
        peliculita.anioPublicacion = 1980;
        peliculita.duracion = 1.5;
        peliculita.actores = new String[] {"Bambi", "Mama de bambi", "El conejo"};
        peliculita.genero = "Infantil";
        peliculita.mostrarInfo();
    }
}
