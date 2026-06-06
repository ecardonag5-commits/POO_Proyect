package oL_oR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Perro perro = new Perro();

        System.out.println("=== OVERLOADING Y OVERRIDING ===");

        // Datos usuario
        System.out.print("Ingrese nombre del perro: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese edad del perro: ");
        int edad = entrada.nextInt();

        System.out.println("\n=== OVERLOADING ===");

        perro.mostrarInfo();

        System.out.println();

        perro.mostrarInfo(nombre);

        System.out.println();

        perro.mostrarInfo(nombre, edad);

        System.out.println("\n=== OVERRIDING ===");

        perro.hacerSonido();

        entrada.close();
    }
}
