package Parcial4;

import java.util.Arrays;

public class PersonaTecnm {
    String nombre;
    int edad;
    String curp;

    public PersonaTecnm(String nombre, int edad, String curp) {
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "PersonaTecnm{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curp='" + curp + '\'' +
                '}';
    }
}