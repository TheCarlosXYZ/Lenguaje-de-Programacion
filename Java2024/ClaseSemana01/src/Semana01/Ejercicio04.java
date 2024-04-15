import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio y la altura del cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el área total y el volumen del cilindro
        double areaTotal = calcularAreaTotal(radio, altura);
        double volumen = calcularVolumen(radio, altura);

        // Imprimir los resultados
        System.out.println("El area total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

        scanner.close();
    }

    // Método para calcular el área total del cilindro
    public static double calcularAreaTotal(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

    // Método para calcular el volumen del cilindro
    public static double calcularVolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
