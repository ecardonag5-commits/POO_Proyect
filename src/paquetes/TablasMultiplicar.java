package paquetes;

public class TablasMultiplicar {

    public static void ejecutar() {

        System.out.println("\n=== USO DE PACKAGES: TABLAS DE MULTIPLICAR ===");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nTabla del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
