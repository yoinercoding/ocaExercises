package variousExercises;

import java.util.Scanner;

public class exercise66 {
    /*
     *   Question based on JAVA Programming Language (Book)
     *  How to swap 2 no using 3rd variable Program in Java
     */
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and Y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping \n x = " + x + "\n y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping \n x = " + x + "\n y = " + y);
    }
}
