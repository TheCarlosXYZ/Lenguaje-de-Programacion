import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las dimensiones del terreno
        System.out.print("Ingrese la longitud del terreno (en metros): ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese el ancho del terreno (en metros): ");
        double ancho = scanner.nextDouble();

        // Calcular el área del terreno
        double area = calcularArea(longitud, ancho);

        // Calcular el precio del terreno
        double precioPorMetroCuadrado = 750; // Costo por metro cuadrado
        double precioTerreno = calcularPrecio(area, precioPorMetroCuadrado);

        // Imprimir los resultados
        System.out.println("El area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: S/. " + precioTerreno);

        scanner.close();
    }

    // Método para calcular el área del terreno
    public static double calcularArea(double longitud, double ancho) {
        return longitud * ancho;
    }

    // Método para calcular el precio del terreno
    public static double calcularPrecio(double area, double precioPorMetroCuadrado) {
        return area * precioPorMetroCuadrado;
    }
}
