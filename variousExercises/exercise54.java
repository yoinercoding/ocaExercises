package variousExercises;

import java.util.Scanner;

public class exercise54 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main(String[] args) {
        //Escribir una app que calcule el factorial de un numero entero (n! = n * (n - 1) * (n - 2) * . . .* 1)

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");

        int n = numero.nextInt();
        int factorial = 1;

        for(int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }
            System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
