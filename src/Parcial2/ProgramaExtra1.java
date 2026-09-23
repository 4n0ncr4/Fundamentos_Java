package Parcial2;
import java.util.Scanner;

public class ProgramaExtra1 {
    static void main() {

        Scanner leer = new Scanner(System.in);
        String [] series = {"Breaking Bad", "Better Call Saul", "Stranger Things", "Dexter",
                            "Mr. Robot", "Six Feet Under", "Black Mirror", "Prison Break"};
        int [] puntuacion = new int [series.length];
        String [] puntuacionString = new String[series.length];

        for (int i = 0; i < series.length; i++) {
            System.out.println("Qué calificación le darías a la serie? (Del 0 al 5)");
            System.out.print(series[i] + ": ");
            int calificacion = leer.nextInt();

            if (calificacion < 0 || calificacion > 5) {
                puntuacion[i] = 0;
                puntuacionString[i] = "pon una calificación válida";
            } else {
                switch (calificacion) {
                    case 0:
                        puntuacion[i] = 0;
                        puntuacionString[i] = "odias la serie";
                        break;
                    case 1:
                        puntuacion[i] = 1;
                        puntuacionString[i] = "no te gustó mucho la serie";
                        break;
                    case 2:
                        puntuacion[i] = 2;
                        puntuacionString[i] = "te parece regular";
                        break;
                    case 3:
                        puntuacion[i] = 3;
                        puntuacionString[i] = "se te hace muy buena serie";
                        break;
                    case 4:
                        puntuacion[i] = 4;
                        puntuacionString[i] = "te gusta mucho la serie";
                    case 5:
                        puntuacion[i] = 5;
                        puntuacionString[i] = "amas la serie";
                        break;
                    default:
                }
            }
        }

        for (int j = 0; j < puntuacion.length; j++) {
            System.out.println((j + 1) + ".- " + "A " + series[j] + " le das un " + puntuacion[j] + " de calificación, "+ puntuacionString[j]);
        }
    }
}