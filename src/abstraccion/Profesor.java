package abstraccion;

public class Profesor extends Empleado {

    private String curso;

    public Profesor(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }

    @Override
    public void trabajar() {
        System.out.println("Impartiendo el curso de " + curso);
    }
}