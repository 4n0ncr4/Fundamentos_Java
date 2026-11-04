package Parcial4;

import java.util.Arrays;

public class Estudiante extends PersonaTecnm{
    String carrera;
    String numeroControl;
    int semestre;
    double calificacionGeneral;
    double[] calificaciones;
    private String especialidad;

    public Estudiante(String nombre, int edad, String curp, String carrera, String numeroControl, int semestre, double calificacionGeneral) {
        super(nombre, edad, curp);
        this.carrera = carrera;
        this.numeroControl = numeroControl;
        this.semestre = semestre;
        this.calificacionGeneral = calificacionGeneral;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void toString2() {
        System.out.println("Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curp='" + curp + '\'' +
                ", carrera='" + carrera + '\'' +
                ", numeroControl='" + numeroControl + '\'' +
                ", semestre=" + semestre +
                ", calificacionGeneral=" + calificacionGeneral +
                ", calificaciones=" + Arrays.toString(calificaciones) +
                '}');
    }
}