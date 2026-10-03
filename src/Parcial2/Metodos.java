package Parcial2;
import java.util.Scanner;

public class Metodos {

    static String evaluarProcesador(String rangoProcesador){
        int uso = leerPorcentaje();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100)");
            uso = leerPorcentaje();
            rangoProcesador = uso <= 70 ? "Estado normal" : uso >= 71 && uso <= 85
                    ? "Requiere supervisión" : "Estado crítico";
        }
        return rangoProcesador;
    }

    static int leerPorcentaje(){
        Scanner leer = new Scanner(System.in);
        int uso = leer.nextInt();
        return uso;
    }

    static void main() {
        System.out.print("Ingresar % de uso del procesador: ");
        System.out.println("Procesador: " + evaluarProcesador(""));
    }
}