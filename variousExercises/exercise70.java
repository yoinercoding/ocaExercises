package variousExercises;

import java.util.Scanner;

public class exercise70 {
    /*
    *       Check it's Armstrong or not
    *       Example:
    *                   371 = 3^3 + 7 + 1³ y
    *                   8208 = 8^4 + 2^4 + 0^4 + 8^4
    *                   4210818 = 4^7 + 2^7 + 1^7 + 0^7 + 8^7 + 1^7 + 8^7
    *
    *       En matemática recreativa un número narcisista es aquel que es igual a la suma de sus dígitos elevados a la
    *       potencia de su número de cifras. Su nombre alude a lo mucho que parecen "quererse a sí mismos".
     */
    public static void main(String[] args) {

        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar un numero para chequear si es un numero Armstrong");
        n = in.nextInt();
        temp = n;

        while(temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while(temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (n == sum) {
            System.out.println(n + " es un numero Armstrong");
        } else {
            System.out.println(n + " no es numero Armstrong");
        }
    }

    static int power(int n, int r) {
        int c, p = 1;
        for(c = 1; c <= r; c++) {
            p = p * n;
        }
        return p;
    }
}
