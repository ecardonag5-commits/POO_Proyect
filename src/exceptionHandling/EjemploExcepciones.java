package exceptionHandling;

import java.util.Scanner;


public class EjemploExcepciones {

	 public static void ejecutar() {

	        Scanner entrada = new Scanner(System.in);

	        System.out.println("\n=== MANEJO DE EXCEPCIONES ===");

	        try {
	            // Entrada de datos
	            System.out.print("Ingrese el numerador: ");
	            int num1 = entrada.nextInt();

	            System.out.print("Ingrese el denominador: ");
	            int num2 = entrada.nextInt();

	            // Operación
	            int resultado = num1 / num2;

	            System.out.println("Resultado: " + resultado);
	            

	        } catch (ArithmeticException e) {
	            System.out.println("Error: No se puede dividir entre cero.");

	        } catch (Exception e) {
	            System.out.println("Error: Entrada inválida.");

	        }

	        System.out.println("El programa continúa sin fallar.");
	        
	                      
	}
}
