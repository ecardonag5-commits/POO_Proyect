package initializer;

import java.util.Scanner;

public class Estudiante {

    String nombre;
    int edad;

    static Scanner entrada = new Scanner(System.in);

    // 🔥 BLOQUE STATIC (se ejecuta una sola vez)
    static {
        System.out.println("=== BLOQUE STATIC ===");
        System.out.println("Clase Estudiante cargada.");
    }

    // 🔥 BLOQUE INSTANCE (se ejecuta cada vez que se crea un objeto)
    {
        System.out.println("\n=== BLOQUE INSTANCE ===");

        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
    }

    // Constructor (se ejecuta después del bloque instance)
    public Estudiante() {
        System.out.println("Constructor ejecutado.");
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
