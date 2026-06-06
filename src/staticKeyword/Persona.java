package staticKeyword;

public class Persona {

    private String nombre;

    // Variable compartida por todos los objetos
    private static int cantidadPersonas = 0;

    public Persona(String nombre) {

        this.nombre = nombre;

        cantidadPersonas++;

        System.out.println("Persona creada: " + nombre);
    }

    public static int getCantidadPersonas() {
        return cantidadPersonas;
    }
}
