package herencia;

public class Profesor extends Persona {

    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad); // Llama al constructor padre
        this.materia = materia;
    }

    public void mostrarProfesor() {
        System.out.println("\n=== PROFESOR ===");
        mostrarDatos();
        System.out.println("Materia: " + materia);
    }
}
