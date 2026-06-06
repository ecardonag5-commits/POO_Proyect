package Main;

import basicsOfPOO.basicPOO;
import exceptionHandling.EjemploExcepciones;
import paquetes.TablasMultiplicar;
import enums.UsoEnum;
import initializer.UsoInitializer;
import parametros.PasoParametros;
import modificadores.UsoAcceso;
import encapsulacion.UsoEncapsulacion;
import herencia.UsoHerencia;
import oL_oR.UsooL_oR;
import fundamentos.FundamentosJava;
import abstraccion.UsoAbstraccion;
import interfaces.UsoInterfaces;
import staticKeyword.UsoStatic;
import conceptosAvanzados.ConceptosAvanzados;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PROYECTO PROGRAMACIÓN POO ===");

        // Ejecutar POO**********************************
        basicPOO.ejecutar();

        // Ejecutar Excepciones***************************
        EjemploExcepciones.ejecutar();
        
        // Ejecutar paquetes/TablasMultiplicar************
        TablasMultiplicar.ejecutar();
        
        // Ejecutar Enum***********
        UsoEnum.ejecutar();
       
        // Ejecutar initializer****************
        UsoInitializer.ejecutar();
        
        // Ejecutar PasoParametros*************
        PasoParametros.ejecutar();
        
        // Ejecutar UsoAcceso******************
        UsoAcceso.ejecutar();
        
        // Ejecutar encapsulacion/UsoEncapsulacion****
        UsoEncapsulacion.ejecutar();
        
        // Ejecutar herencia**************************
        UsoHerencia.ejecutar();
        
        // Ejecutar Overloading y Overriding**********
        UsooL_oR.ejecutar();
        
        // Ejecutar Fundamentos***********************
        FundamentosJava.ejecutar();
        
        // Ejecutar abstracción***********************
        UsoAbstraccion.ejecutar();
        
        // Ejecutar Interfaces************************
        UsoInterfaces.ejecutar();
        
        // Ejecutar Static Keyword********************
        UsoStatic.ejecutar();
        
        // Ejecutar Conceptos Avanzados***************
        ConceptosAvanzados.ejecutar();
        
        System.out.println("##### Fin Semana 1 #####");
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("##### Fin Semana 2 #####");
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("##### Fin Semana 3 #####");
        System.out.println("======================");
        System.out.println("##### Fin Semana 4-5 #####");
        System.out.println("==============================");
        System.out.println("##### Fin Semana/RoadMap ######");
        System.out.println("==============================");
    }
}
