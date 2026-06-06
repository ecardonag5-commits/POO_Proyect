package interfaces;

public class UsoInterfaces {

    public static void ejecutar() {

        System.out.println("\n=== INTERFACES ===");

        Alumno alumno1 = new Alumno("Angel", 85);
        Alumno alumno2 = new Alumno("Luis", 55);

        alumno1.evaluar();
        System.out.println();

        alumno2.evaluar();
    }
}
