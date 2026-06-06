package conceptosAvanzados;

public class PersonaEncadenada {

    private String nombre;
    private int edad;

    public PersonaEncadenada setNombre(String nombre) {

        this.nombre = nombre;
        return this;
    }

    public PersonaEncadenada setEdad(int edad) {

        this.edad = edad;
        return this;
    }

    public void mostrar() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
