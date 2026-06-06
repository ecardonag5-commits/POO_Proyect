package modificadores;

public class UsoAcceso {

    public static void ejecutar() {

        System.out.println("\n=== ACCESS SPECIFIERS ===");

        EjemploAcceso obj = new EjemploAcceso();

        // Acceso desde misma package
        System.out.println("\n--- Desde misma package ---");

        // private NO se puede acceder directamente
        System.out.println("Private (usando getter): " + obj.getPrivado());

        // default ✔
        System.out.println(obj.porDefecto);

        // protected ✔
        System.out.println(obj.protegido);

        // public ✔
        System.out.println(obj.publico);

        // Mostrar desde dentro
        obj.mostrarDesdeDentro();
    }
}
