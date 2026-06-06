package parametros;

import java.util.Scanner;

public class PasoParametros {

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=== PASS BY VALUE / REFERENCE ===");

        // =========================
        // 1. PRIMITIVO (int)
        // =========================
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        cambiarValor(numero);

        System.out.println("Valor original después del método: " + numero);

        // =========================
        // 2. OBJETO
        // =========================
        Caja caja = new Caja();

        System.out.print("\nIngrese valor para la caja: ");
        caja.valor = entrada.nextInt();

        cambiarObjeto(caja);

        System.out.println("Valor de la caja después del método: " + caja.valor);
    }

    // 🔹 Método con primitivo
    public static void cambiarValor(int num) {
        num = num + 10;
        System.out.println("Dentro del método (primitivo): " + num);
    }

    // 🔹 Método con objeto
    public static void cambiarObjeto(Caja c) {
        c.valor = c.valor + 10;
        System.out.println("Dentro del método (objeto): " + c.valor);
    }
}
