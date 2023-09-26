package variousExercises;

import java.util.*;
public class exercise59 {
    /*
     *       Java Programacion orientada a objetos OOP
     *
     *   Dados dos vectores de enteros, A y B, construir un tercer vector C que contengan la intersercion de los dos
     *   anteriores.
     */
    static void intersection(int a[], int b[], int n, int m) {

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] > b[j]) {
                j++;
            } else if (b[j] > a[i]) {
                i++;
            } else {
                System.out.println(a[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = { 1, 10, 2, 8};
        int[] b = { 10, 6, 5};

        int n = a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        intersection(a, b, n, m);
    }
}

