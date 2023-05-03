/*
*       Consider the following Java Code
*/
public class exercise10 {
    private static int myInt;
    private static boolean myBoolean;
    private static String myString;
    public static void main(String[] args) {
        System.out.println("My int is: " + myInt);
        System.out.println("My boolean is: " + myBoolean);
        System.out.println("My string is: " + myString);
    }
}                   // What will be printed to the console when this code is run?

                /*
                *   a- My int is: 0, My Boolean is: false, My String is: null  <---- Correct answer
                *   b- My int is: null, My Boolean is: false, My String is: null
                *   c- My int is: 0, My Boolean is: true, My String is: null
                *   d- My int is: null, My Boolean is: true, My String is: null
                *   e- A compile-time error
                *   f- An exception will be thrown at runtime
                */
