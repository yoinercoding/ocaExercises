package variousExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class exercise58 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main(String[] args) {
        /*  Escribir un programa que guarde en un vector los elementos minimos de cada fila de una matriz de enteros y,
         *   luego muestre cual es el mayor y el menor.
         */

        final int filas = 2, columnas = 3;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] array = new int[filas][columnas]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("array[" + i + "][" + j + "]= ");
                array[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz
        mayor = menor = array[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < array.length; i++) {  //para cada fila de la matriz
            for (j = 0; j < array[i].length; j++) { //para cada columna de la matriz
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (array[i][j] < menor) {
                    menor = array[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        //Mostrar por pantalla el mayor elemento de la matriz, el menor y las posiciones que ocupan
        System.out.print("Elemento mayor: " + mayor);
        System.out.println(" Fila: " + filaMayor + " Columna: " + colMayor);
        System.out.print("Elemento menor: " + menor);
        System.out.println(" Fila: " + filaMenor + " Columna: " + colMenor);
    }
}

