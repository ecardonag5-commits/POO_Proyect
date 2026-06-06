package abstraccion;

public class UsoAbstraccion {

    public static void ejecutar() {

        System.out.println("\n=== ABSTRACCIÓN ===");

        Profesor profesor =
                new Profesor("Angel", "Programación Orientada a Objetos");

        profesor.mostrarNombre();
        profesor.trabajar();
    }
}

