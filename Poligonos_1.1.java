/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

/**
 *
 *
 *
 *
 *
 * import java.util.Scanner;
 *
 * /
 *
 **
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

    public static double areaCuadrado(double medir) {
        /**
         * Inicio codificación: LU1SBL4N - 3/12/2021
         */
        return (medir * medir);
    }

    public static double areaPentagono(double medir) {

        return (1.72 * (medir * medir));
    }

    public static double areaHexagono(double medir) {

        return ((3 * Math.sqrt(3) * medir * medir) / 2);
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
        double lado, base, radio, area;
        String sol_perimetro, sol_area;
        sol_perimetro = "El perímetro es ";
        sol_area = "Su area es ";

        //constantes            
        final double DIV_APOT_PENT = 1.453, DIV_APOT_HEX = 1.15, PI = Math.PI;
        final String CABECERA_MENU, OPCIONES, SALIR, PEDIR_LADO, PEDIR_BASE, PEDIR_RADIO, ERROR, ADIOS;
        CABECERA_MENU = "Indique el polígono regular del cual desea calcular area y perímetro:";
        OPCIONES = "\n1. Círculo\n2. Rectángulo\n3. Triángulo\n4. Cuadrado\n5. Pentágono\n6. Hexágono";
        SALIR = "\nO. pulse 0 para salir\n";
        PEDIR_RADIO = "Introduzca su radio:";
        PEDIR_BASE = "Introduzca la base";
        PEDIR_LADO = "¿Cuánto mide el lado?";
        ERROR = "Error en la introducción";
        ADIOS = "¡Adios!";

        do {

            System.out.println(CABECERA_MENU + OPCIONES + SALIR);
            poligono = teclado.nextInt();

            switch (poligono) {
                case 1: //circulo
                    System.out.println(PEDIR_RADIO);
                    radio = teclado.nextDouble();

                    System.out.println(sol_perimetro + perimetroCirculo(radio));
                    System.out.println(sol_area + areaCirculo(radio) + "\n");

                    break;
                case 2: //rectangulo
                    System.out.println(PEDIR_BASE);
                    base = teclado.nextDouble();

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();

                    System.out.println(sol_perimetro + perimetroRectangulo(base, lado));
                    System.out.println(sol_area + areaRectangulo(base, lado) + "\n");
                    break;

                case 3: //triangulo
                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    System.out.println(sol_perimetro + perimetroPoligono(poligono, lado));

                    area = areaTriangulo(lado);
                    System.out.println(sol_area + area + "\n");
                    break;

                case 4:
                    /*Inicio codificación: LU1SBL4N - 3/12/2021*/
                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    System.out.println(sol_perimetro + perimetroPoligono(poligono, lado));
                    area = areaCuadrado(lado);
                    System.out.println(sol_area + area + "\n");

                    break;

                case 5: //pentagono  

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    System.out.println(sol_perimetro + perimetroPoligono(poligono, lado));
                    area = areaPentagono(lado);
                    System.out.println(sol_area + area + "\n");

                    break;

                case 6: //hexagono

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    System.out.println(sol_perimetro + perimetroPoligono(poligono, lado));
                    area = areaHexagono(lado);
                    System.out.println(sol_area + area + "\n");

                    break;
                /*Fin de codificacion: LU1SBL4N - 3/12/2021*/
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
