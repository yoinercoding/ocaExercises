public class exercise47 {
    /*
    *       Consider the following Java method:
     */
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Underage");
        } else {
            System.out.println("Welcome!");
        }
}
        /*
        *       What will happen if you call the method like this: checkAge(15);
        *   a- The program will print "Welcome!"
        *   b- The program will print "Underage"
        *   c- The program will throw a NullPointerException
        *   d- It will not compile because IllegalArgumentException is not handled and does not specific
        *   e- The program will throw an IllegalArgumentException <--- Correct answer
        *   f- The program will throw a RunTimeException
         */
}
