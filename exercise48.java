public class exercise48 {
    /*
    *       Consider the following code snippet:
     */
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[4] = 3;
            System.out.println("This statement will not be executed");
    }
    /*
    *       What will nbe the output when executing the code?
    *   a- Exception in thread "main" java.lang.RunTimeException: 4
    *   b- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4 <--- Correct answer
    *   c- Exception in thread "main" java.lang.StackOverflowException: 4
    *   d- Exception in thread "main" java.lang.NullPointerException: 4
    *   e- The code will not compile
     */
}
