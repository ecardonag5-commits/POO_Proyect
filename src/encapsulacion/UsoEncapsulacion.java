package encapsulacion;

import java.util.Scanner;

public class UsoEncapsulacion {

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=== ENCAPSULACIÓN (TIENDA) ===");

        // Crear producto
        Producto producto = new Producto("Laptop", 5);
        
        System.out.println("======================");
        System.out.println("=== 🔎 laptop/Laptop ====");
        System.out.println("======================");

        System.out.print("Ingrese el nombre del producto que busca: ");
        String busqueda = entrada.nextLine();
        
        // Comparar
        if (busqueda.equalsIgnoreCase(producto.getNombre())) {

            System.out.println("Producto encontrado: " + producto.getNombre());

            if (producto.hayStock()) {
                System.out.println("Hay stock disponible: " + producto.getStock());
            } else {
                System.out.println("Producto sin stock.");
            }

        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}