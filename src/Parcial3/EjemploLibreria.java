package Parcial3;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.Arrays;

public class EjemploLibreria {
    public static void main(String[] args) {

        double[] datos = {1, 2, 3, 4, 5};
        DescriptiveStatistics stats = new DescriptiveStatistics(datos);

        System.out.println("Datos: " + Arrays.toString(datos));
        System.out.println("Media: " + stats.getMean());
        System.out.println("Desviación estándar: " + stats.getStandardDeviation());
        System.out.println("Máximo: " + stats.getMax());
        System.out.println("Mínimo: " + stats.getMin());

        double[][] datosM1 = {{1, 2}, {3, 4}};
        double[][] datosM2 = {{5, 6}, {7, 8}};

        RealMatrix m1 = new Array2DRowRealMatrix(datosM1);
        RealMatrix m2 = new Array2DRowRealMatrix(datosM2);

        RealMatrix suma = m1.add(m2);
        System.out.println("\nSuma de matrices:");
        imprimirMatriz(suma);

        RealMatrix producto = m1.multiply(m2);
        System.out.println("\nProducto de matrices:");
        imprimirMatriz(producto);

        System.out.println("\nTranspuesta de m1:");
        imprimirMatriz(m1.transpose());
    }

    static void imprimirMatriz(RealMatrix m) {
        for (double[] fila : m.getData()) {
            System.out.println(Arrays.toString(fila));
        }
    }
}