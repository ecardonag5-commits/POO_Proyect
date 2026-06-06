package encapsulacion;

public class Producto {

    private String nombre;
    private int stock;

    // Constructor
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    // Setter con validación
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Método para verificar disponibilidad
    public boolean hayStock() {
        return stock > 0;
    }
}
