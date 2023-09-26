package variousExercises;

import java.util.Scanner;

public class exercise56 {
    /*
     *       Java Programacion orientada a objetos OOP
     */

    public static boolean esPrimo(int n) {
        if(n <= 1) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else {
            for(int i = 2; i < n; i++) {
                if(n % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[]args) {
        //Escribir un algoritmo que imprima todos los numeros primos desde 2 hasta n.
        for(int i = 2; i <= 100; i++) {
            System.out.println(i + " -> " + esPrimo(i));
        }
    }
}

