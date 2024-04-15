import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en kilogramos y su altura en metros
        System.out.print("Por favor, ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Por favor, ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = calcularIMC(peso, altura);

        // Imprimir el resultado
        System.out.println("Su indice de masa corporal (IMC) es: " + imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        // Calcular el IMC utilizando la fórmula IMC = peso / (altura^2)
        double imc = peso / (altura * altura);
        return imc;
    }
}
