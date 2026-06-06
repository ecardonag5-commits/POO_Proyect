package conceptosAvanzados;

public class ConceptosAvanzados {

    public static void ejecutar() {

        System.out.println("\n=== CONCEPTOS AVANZADOS ===");

       
        // FINAL KEYWORD
       
        System.out.println("\n--- Final Keyword ---");

        final String universidad = "UMG";

        System.out.println("Universidad: " + universidad);

      
        // OBJECT LIFECYCLE
      
        System.out.println("\n--- Object Lifecycle ---");

        Persona persona = new Persona();

    
        // METHOD CHAINING
       
        System.out.println("\n--- Method Chaining ---");

        PersonaEncadenada p = new PersonaEncadenada();

        p.setNombre("Angel")
         .setEdad(20)
         .mostrar();

       
        // NESTED CLASS
      
        System.out.println("\n--- Nested Classes ---");

        Universidad.Facultad facultad =
                new Universidad.Facultad();

        facultad.mostrar();

      
        // RECORD
  
        System.out.println("\n--- Record ---");

        Alumno alumno = new Alumno("Angel", 20);

        System.out.println(alumno);

        // STATIC VS DYNAMIC BINDING
       
        System.out.println("\n--- Static vs Dynamic Binding ---");

        Animal animal = new Perro();

        animal.hacerSonido();
    }
}
