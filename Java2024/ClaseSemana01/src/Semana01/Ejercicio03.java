import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base y la altura del rectángulo
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área y el perímetro del rectángulo
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        // Imprimir los resultados
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        scanner.close();
    }

    // Método para calcular el área del rectángulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
