package herencia;

public class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llama al constructor padre
        this.carrera = carrera;
    }

    public void mostrarAlumno() {
        System.out.println("\n=== ALUMNO ===");
        mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }
}