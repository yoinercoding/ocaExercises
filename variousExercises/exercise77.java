package variousExercises;

import java.util.Scanner;

public class exercise77 {
    /*
    *       Compare ranges of two Strings
     */
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar el primer String: ");
        s1 = in.nextLine();
        System.out.println("Ingresar el segundo String: ");
        s2 = in.nextLine();

        if(s1.compareTo(s2) > 0) {
            System.out.println("El primer String es mas grande que el segundo.");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("El primer String es mas pequeño que el segundo.");
        } else {
            System.out.println("Ambos Strings son iguales.");
        }
    }
}
