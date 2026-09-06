package Parcial1;
import java.util.Scanner;

public class IfAnidado {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuál es tu nombre? ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Eres administrador o empleado? ");
        String tipoEmpleado = scanner.nextLine();

        System.out.print("Qué rango eres? (1) / (2) ");
        int rangoEmpleado = scanner.nextInt();

        if (tipoEmpleado.equals("administrador")) {
            if (rangoEmpleado == 1) {
                System.out.println("Bienvenido " + nombreEmpleado);
                System.out.println("Tienes acceso ilimitado");
            } else if (rangoEmpleado == 2) {
                System.out.println("Bienvenido " + nombreEmpleado);
                System.out.println("Tienes acceso completo");
            } else {
                System.out.println("Favor de ingresar un rango de empleado válido");
            }
        } else if (tipoEmpleado.equals("empleado")) {
            if (rangoEmpleado == 1) {
                System.out.println("Bienvenido " + nombreEmpleado);
                System.out.println("Tienes acceso a consultas");
            } else if (rangoEmpleado == 2) {
                System.out.println("Bienvenido " + nombreEmpleado);
                System.out.println("Tienes acceso a consultas y registros");
            } else {
                System.out.println("Favor de ingresar un rango de empleado válido");
            }
        } else {
            System.out.println("Ni si quiera sé quién eres");
        }


        /* (PROGRAMA EXTRA)

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al SAT");
        System.out.println("Favor de contestar solo con true / false");
        System.out.print("Agendaste una cita? ");
        boolean cita = sc.nextBoolean();

        System.out.print("Tienes tu INE vigente? ");
        boolean ineVigente = sc.nextBoolean();

        System.out.print("Tienes tu comprobante de domicilio? ");
        boolean comprobanteDomicilio = sc.nextBoolean();

        System.out.print("Traes memoria USB? ");
        boolean memoriaUSB = sc.nextBoolean();

        if (cita == true) {
            if (ineVigente == true) {
                if (comprobanteDomicilio == true) {
                    if (memoriaUSB == true) {
                        System.out.println("Tome asiento");
                    } else {
                        System.out.println("Tiene una prorroga de 10 minutos para conseguir una USB");
                    }
                } else {
                    System.out.println("Regrese cuando tenga los requisitos");
                }
            } else {
                System.out.println("Favor de tener sus documentos actualizados");
            }
        } else {
            System.out.println("Vayase a la verdura");
        }
        */

        /* EJERCICIOS DE CLASE
        String tipo = "Asalariado";
        int ganas = 400000;
        int cantidadTrabajos = 2;

        if (tipo.equals("Asalariado")) {
            System.out.println("Patron");
            if (ganas >= 400000 || cantidadTrabajos >= 2) {
                System.out.println("Declaracion anual");
            }
        } else {
            System.out.println("Obligaciones");
            System.out.println("Declaracion anual");
            System.out.println("Declaracion mensual");
        } */
    }
}