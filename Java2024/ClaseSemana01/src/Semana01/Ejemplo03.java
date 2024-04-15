
package Semana01;
import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Corregido el nombre del sistema de entrada
        float base, altura, area; // Corregido el formato de declaración de variables
        
        // Solicitar al usuario que ingrese la base
        System.out.print("Ingresa la base: ");
        base = teclado.nextFloat();
        
        // Solicitar al usuario que ingrese la altura
        System.out.print("Ingresa la altura: ");
        altura = teclado.nextFloat();
        
        // Calcular el área
        area = base * altura;
        
        // Imprimir el área
        System.out.println("El area es: " + area);
    }
}

