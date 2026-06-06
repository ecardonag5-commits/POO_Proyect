package staticKeyword;

public class UsoStatic {

    public static void ejecutar() {

        System.out.println("\n=== STATIC KEYWORD ===");

        Persona p1 = new Persona("Esau");
        Persona p2 = new Persona("Victor");
        Persona p3 = new Persona("Melida");

        System.out.println();
        System.out.println("Total de personas creadas: "
                + Persona.getCantidadPersonas());
    }
}
