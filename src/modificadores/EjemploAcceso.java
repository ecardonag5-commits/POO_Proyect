package modificadores;

public class EjemploAcceso {

    private String privado = "Soy PRIVATE";
    String porDefecto = "Soy DEFAULT";
    protected String protegido = "Soy PROTECTED";
    public String publico = "Soy PUBLIC";

    // Método para mostrar todos desde dentro
    public void mostrarDesdeDentro() {
        System.out.println("\n--- Desde la misma clase ---");
        System.out.println(privado);
        System.out.println(porDefecto);
        System.out.println(protegido);
        System.out.println(publico);
    }

    // Getter para private
    public String getPrivado() {
        return privado;
    }
}