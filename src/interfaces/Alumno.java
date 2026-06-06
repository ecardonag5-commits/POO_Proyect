package interfaces;

public class Alumno implements Evaluable {

    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public void evaluar() {

        System.out.println("Alumno: " + nombre);

        if (nota >= 61) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}
