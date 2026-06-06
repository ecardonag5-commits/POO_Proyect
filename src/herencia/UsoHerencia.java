package herencia;

public class UsoHerencia {

    public static void ejecutar() {

        System.out.println("\n=== HERENCIA ===");

        // Crear alumno
        Alumno alumno = new Alumno("Angel", 20, "Ingeniería en Sistemas");

        // Crear profesor
        Profesor profesor = new Profesor("Carlos", 40, "Programación");

        // Mostrar datos
        alumno.mostrarAlumno();
        profesor.mostrarProfesor();
    }
}
