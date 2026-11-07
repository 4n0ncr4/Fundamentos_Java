package Parcial4;

public class Mainsito {
    static void main() {

        Calculadora papoi = new Calculadora();
        papoi.sumar(1,2);
        double valor1 = 10.4;
        double valor2 = 11.11;
        papoi.sumar(valor1,valor2);
        int valor3 = 2;
        papoi.sumar(1, valor3, 4);
        papoi.mostrar(6,7,9);

    }
}
