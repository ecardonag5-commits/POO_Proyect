package POO;

public class programación_poo {

    public static void main(String[] args) {

        System.out.println("=== TYPE CASTING EN JAVA ===");

        // =========================
        // 1. CASTING IMPLÍCITO
        // =========================
        int numeroEntero = 10;
        double numeroDecimal;

        numeroDecimal = numeroEntero; // conversión automática

        System.out.println("\nCasting Implícito:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Convertido a double: " + numeroDecimal);

        // =========================
        // 2. CASTING EXPLÍCITO
        // =========================
        double otroDecimal = 9.75;
        int otroEntero;

        otroEntero = (int) otroDecimal; // conversión manual

        System.out.println("\nCasting Explícito:");
        System.out.println("Decimal: " + otroDecimal);
        System.out.println("Convertido a int: " + otroEntero);

        // ========================
        // 3.      EJEMPLO 
        // ========================
        int a = 5;
        int b = 2;

        double resultado = (double) a / b; // casting para división exacta

        System.out.println("\nEjemplo práctico:");
        System.out.println("División sin casting: " + (a / b)); // entero
        System.out.println("División con casting: " + resultado); // decimal
    }
}
