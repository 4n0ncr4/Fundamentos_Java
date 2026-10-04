package Parcial2;
import java.util.Scanner;

public class MetodosTarea {

    static void main() {
        mostrarResultados();
    }

    static int leerPorcentaje(){
        Scanner leer = new Scanner(System.in);
        int uso = leer.nextInt();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100): ");
            uso = leerPorcentaje();
        }
        return uso;
    }

    static String evaluarProcesador(int uso){
        String rangoProcesador = uso <= 70 ? "Estado normal" : uso >= 71 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarMemoria(int uso){
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarAlmacenamiento(int uso){
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarServidor(int procesador,  int memoria, int almacenamiento){
        if (procesador > 70){
            if (procesador > 85){
                return "Estado crítico del procesador";
            }
            return "No está funcionando correctamente el procesador";
        }
        if (memoria > 75){
            if (memoria > 85){
                return "Estado crítico de la memoria";
            }
            return "No está funcionando correctamente la memoria RAM";
        }
        if (almacenamiento > 75){
            if (almacenamiento > 85){
                return "Estado crítico en el almacenamiento";
            }
            return "El almacenamiento está casi lleno";
        }
        return "Estado normal: Todo está bien";
    }

    static String mostrarResultados() {
        // Obtener los datos
        System.out.print("Ingresa el % de uso del procesador: ");
        int valorProcesador = leerPorcentaje();
        System.out.print("Ingresa el % de uso de la memoria RAM: ");
        int valorMemoria = leerPorcentaje();
        System.out.print("Ingresa el % de uso del almacenamiento: ");
        int valorAlmacenamiento = leerPorcentaje();
        // Mostrar resultados
        String procesador = evaluarProcesador(valorProcesador);
        String memoria = evaluarMemoria(valorMemoria);
        String almacenamiento = evaluarAlmacenamiento(valorAlmacenamiento);
        // Evaluar el servidor
        String resultadoServidor = evaluarServidor(valorProcesador,valorMemoria,valorAlmacenamiento);
        System.out.println("-------------------------");
        System.out.println("   Reporte de Servidor   ");
        System.out.println("-------------------------");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria: " + memoria);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Estado del servidor: " + resultadoServidor);
        System.out.println("-------------------------");
        return "";
    }
}