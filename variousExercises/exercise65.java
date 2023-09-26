package variousExercises;

import java.util.Scanner;

public class exercise65 {
    /*
     *   Question based on JAVA Programming Language (Book)
     *          Hot to convert Fahrenheit to Celsius
     */
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32 )*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);
    }
}
