package oL_oR;

public class Animal {

    // OVERLOADING

    public void mostrarInfo() {
        System.out.println("Animal sin datos");
    }

    public void mostrarInfo(String nombre) {
        System.out.println("Nombre: " + nombre);
    }

    public void mostrarInfo(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método para OVERRIDING
    public void hacerSonido() {
        System.out.println("El animal hace un sonido...");
    }
}
