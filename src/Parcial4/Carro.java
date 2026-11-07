package Parcial4;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean encendido;

    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        System.out.println(marca + " " + modelo + " está encendido");
    }

    public void acelerar(int incremento) {
        if (!encendido) {
            System.out.println("Primero debes encender el coche");
            return;
        }
        velocidad += incremento;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("Frenando... Velocidad: " + velocidad + " km/h");
    }

    public String getInfo() {
        return marca + " " + modelo + " " + color + " - " + velocidad + " km/h";
    }
    /*
    String modelo;
    String color;
    String [] marcas;
    String [] categoria;
    String [] llantas;
    String [] numeroDeSerie;
    int anio;
    int capacidad;
    double precio;
    double kilometraje;
    boolean estado = false;

    public void mostrarInfo(){
        while (true);
    }

    public void prender(){
        System.out.println("Estado del carro: " + estado);
        if (estado == true){
            System.out.println("El carro ya está prendido");
        } else {
            estado = true;
            System.out.println("Se encendió el carro");
        }
    }

    public int acelerar(int cantidad){
        return cantidad;
    }
     */

}
