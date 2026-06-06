package enums;

public class UsoEnum {

	public static void ejecutar(){


        System.out.println("\n=== USO DE ENUMS ===");

        DiaSemana dia = DiaSemana.VIERNES;

        System.out.println("Día seleccionado: " + dia);

        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Es día laboral");
        }
    }
}