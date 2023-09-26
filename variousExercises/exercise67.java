package variousExercises;

import java.util.Scanner;

public class exercise67 {
    /*
     *   Question based on JAVA Programming Language (Book)
     *      How to swap 2 no without using 3rd variable
     */
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before swapping \n x = " + x + "\n y = " +y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping \n x = " + x + "\n y = " +y);
    }
}
