package Parcial2;
import java.util.Scanner;

public class Metodos {
    static void main() {
        System.out.println(mostrarResultados());
    }

    static int leerPorcentaje(){
        Scanner leer = new Scanner(System.in);
        int uso = leer.nextInt();
        return uso;
    }

    static String evaluarProcesador(int uso){
        System.out.print("Ingresa el % de uso del procesador: ");
        uso = leerPorcentaje();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100): ");
            uso = leerPorcentaje();
        }
        String rangoProcesador = uso <= 70 ? "Estado normal" : uso >= 71 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarMemoria(int uso){
        System.out.print("Ingresa el % de uso de la memoria RAM: ");
        uso = leerPorcentaje();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100): ");
            uso = leerPorcentaje();
        }
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarAlmacenamiento(int uso){
        System.out.print("Ingresa el % de uso del almacenamiento: ");
        uso = leerPorcentaje();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100): ");
            uso = leerPorcentaje();
        }
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarServidor(){
        return "N/A";
    }

    static String mostrarResultados() {
        String a = evaluarProcesador(0);
        String b = evaluarMemoria(0);
        String c = evaluarAlmacenamiento(0);
        String d = evaluarServidor();
        System.out.println("-------------------------");
        System.out.println("   Reporte de Servidor   ");
        System.out.println("-------------------------");
        System.out.println("Procesador: " + a);
        System.out.println("Memoria: " + b);
        System.out.println("Almacenamiento: " + c);
        System.out.println("Estado del servidor: " + d);
        System.out.println("-------------------------");
        return "";
    }
}