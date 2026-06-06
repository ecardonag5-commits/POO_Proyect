package initializer;

public class UsoInitializer {

    public static void ejecutar() {

        System.out.println("\n=== USO DE INITIALIZER BLOCK ===");

        // Crear objeto
        Estudiante e1 = new Estudiante();

        System.out.println("\nDatos del estudiante:");
        e1.mostrarDatos();
    }
}