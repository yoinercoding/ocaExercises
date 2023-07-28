import java.util.Arrays;
import java.util.Scanner;

public class exercise58 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main(String[] args) {
        /*  Escribir un programa que guarde en un vector los elementos minimos de cada fila de una matriz de enteros y,
         *   luego muestre cual es el mayor y el menor.
         */

        final int filas = 3, columnas = 3;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] A = new int[filas][columnas]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz
        mayor = menor = A[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < A.length; i++) {  //para cada fila de la matriz
            for (j = 0; j < A[i].length; j++) { //para cada columna de la matriz
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (A[i][j] < menor) {
                    menor = A[i][j];
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

