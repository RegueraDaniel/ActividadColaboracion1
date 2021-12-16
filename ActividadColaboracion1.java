/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

 /*
 *
 * @author Daniel Reguera Bazan, Luis Miguel Blanco Segura
 *
 */
public class Poligonos {

    public static double perimetroPoligono(int lados, double medir) {
        return (lados * medir);
    }

    public static double perimetroCirculo(double r) {
        final double PI = Math.PI;
        return (PI * r * r);
    }

    public static double areaCirculo(double r) {
        final double PI = Math.PI;
        return (2 * PI * r);
    }

    public static double perimetroRectangulo(double x, double y) {
        return ((x * 2) + (y * 2));
    }

    public static double areaRectangulo(double x, double y) {
        return (x * y);
    }

    public static double areaTriangulo(double medir) {
        return ((medir * medir) * ((Math.sqrt(3) / 4)));
    }

    public static double areaPentagono(double medir) {

        return (1.72 * (medir * medir));
    }

    /**
     * Fin de codificacion : LU1SBL4N - 3/12/2021
     *
     * /
     *
     **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //declaracion de variables
        int poligono;
        double lado, base, radio, area, altura = 0, superficie;
        String sol_area, sol_volumen;
        
        /*Principio de codificacion: DRB - 16/12/2021*/
        sol_area = "El area es ";
        /*Fin de codificacion: DRB - 16/12/2021*/
        
        sol_volumen = "Su volumen es ";

        //constantes            
        
        final String CABECERA_MENU, OPCIONES, SALIR, PEDIR_LADO, PEDIR_BASE, PEDIR_RADIO, ERROR, ADIOS, PEDIR_ALTURA;
        CABECERA_MENU = "Indique el polígono regular del cual desea calcular area y perímetro:";
        OPCIONES = "\n1. Círculo\n2. Rectángulo\n3. Triángulo \n5. Pentágono";
        SALIR = "\nO. pulse 0 para salir\n";
        PEDIR_RADIO = "Introduzca su radio:";
        PEDIR_BASE = "Introduzca la base";
        PEDIR_LADO = "¿Cuánto mide el lado?";

        /*Principio de codificacion: LU1SBL4N - 13/12/2021*/
        PEDIR_ALTURA = "¿Cuánto mide la altura?";
        /*Fin de codificacion: LU1SBL4N - 13/12/2021*/
        
        ERROR = "Error en la introducción";
        ADIOS = "¡Adios!";

        do {

            System.out.println(CABECERA_MENU + OPCIONES + SALIR);
            poligono = teclado.nextInt();

            /*Principio de codificacion: LU1SBL4N - 13/12/2021*/
            do {

                System.out.println(PEDIR_ALTURA);
                altura = teclado.nextDouble();

            } while (altura <= 0);

            /*Fin de codificacion: LU1SBL4N - 13/12/2021*/
            switch (poligono) {
                case 1: //circulo
                    System.out.println(PEDIR_RADIO);
                    radio = teclado.nextDouble();
                    
                    System.out.println(sol_area + (areaCirculo(radio)*2+perimetroCirculo(radio)*altura));
                    System.out.println(sol_volumen + areaCirculo(radio) * altura + "\n");

                    break;
                case 2: //rectangulo
                    System.out.println(PEDIR_BASE);
                    base = teclado.nextDouble();

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                    /*Principio de codificacion: DRB - 16/12/2021*/
                    area=areaRectangulo(base, lado)*2+perimetroRectangulo(base, lado)*altura;
                    System.out.println(sol_area + area);
                    /*Fin de codificacion: DRB - 16/12/2021*/
                    
                    System.out.println(sol_volumen + areaRectangulo(base, lado) * altura + "\n");
                    break;

                case 3: //triangulo
                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                    area = areaTriangulo(lado);
                    
                    /*Principio de codificacion: DRB - 16/12/2021*/
                    superficie=areaTriangulo(lado)*2+perimetroPoligono(poligono, lado)*altura;
                    System.out.println(sol_area + superficie);
                    /*Fin de codificacion: DRB - 16/12/2021*/
                    
                    System.out.println(sol_volumen + area *altura+ "\n");
                    break;

                case 5: //pentagono  

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                    area = areaPentagono(lado);
                    
                    /*Principio de codificacion: DRB - 16/12/2021*/
                    superficie=areaPentagono(lado)*2+perimetroPoligono(poligono, lado)*altura;   
                    System.out.println(sol_area + superficie);
                    /*Fin de codificacion: DRB - 16/12/2021*/
                    
                    System.out.println(sol_volumen + area * altura + "\n");

                    break;

                default:
                    if (poligono != 0) {
                        System.out.println(ERROR);
                    } else {
                        System.out.println(ADIOS);
                    }
            }
        } while (poligono != 0);
    }
}

}



