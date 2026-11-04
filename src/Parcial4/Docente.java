package Parcial4;

import java.util.Arrays;

public class Docente extends PersonaTecnm {
    int cantidadEstudiantes;
    int aniosTrabajando;

    public Docente(String nombre, int edad, String curp, int cantidadEstudiantes, int aniosTrabajando) {
        super(nombre, edad, curp);
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.aniosTrabajando = aniosTrabajando;
    }

    public void toString2() {
        System.out.println( "Docente{" +
                "nombre='" + nombre + '\'' +

                ", edad=" + edad +
                ", curp='" + curp + '\'' +
                ", cantidadEstudiantes=" + cantidadEstudiantes +
                ", aniosTrabajando=" + aniosTrabajando +
                '}');
    }
}