package basicsOfPOO;

public class basicPOO {

    public static void ejecutar() {

        System.out.println("\n=== PROGRAMACIÓN ORIENTADA A OBJETOS ===");

        Rectangulo rect = new Rectangulo();

        rect.base = 5;
        rect.altura = 3;

        double area = rect.calcularArea();

        System.out.println("Base: " + rect.base);
        System.out.println("Altura: " + rect.altura);
        System.out.println("Área del rectángulo: " + area);
    }
}
