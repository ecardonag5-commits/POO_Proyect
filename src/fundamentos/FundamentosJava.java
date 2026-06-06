package fundamentos;

public class FundamentosJava {

    public static void ejecutar() {

        System.out.println("\n=== FUNDAMENTOS DE JAVA ===");

       
        // 1. STRINGS Y MÉTODOS
       
        String nombre = "Angel";

        System.out.println("\n--- Strings y Métodos ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Mayúsculas: " + nombre.toUpperCase());
        System.out.println("Cantidad de letras: " + nombre.length());

    
        // 2. OPERACIONES MATEMÁTICAS
   
        int a = 10;
        int b = 5;

        System.out.println("\n--- Operaciones Matemáticas ---");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

        // 3. ARRAYS
      
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("\n--- Arrays ---");

        for (int numero : numeros) {
            System.out.println(numero);
        }

    
        // 4. CONDICIONALES
    
        System.out.println("\n--- Condicionales ---");

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(b + " es mayor que " + a);
        }

        // 5. LOOPS
       
        System.out.println("\n--- Loops ---");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }

        // 6. RELACIÓN CON POO
       
        System.out.println("\n--- Basics of POO ---");
        System.out.println("Los fundamentos de Java sirven como base");
        System.out.println("para trabajar posteriormente con objetos.");
    }
}
