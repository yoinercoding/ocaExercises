package variousExercises;

import java.util.ArrayList;
        /*
        *       Consider the following code:
        */
public class exercise35 {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.remove(2);
        System.out.println(numbers.get(2));
    }

    /*
    *       What will be printed when the above code is executed?
    *   a- 10
    *   b- 15
    *   c- 20 <---- Correct answer
    *   d- An IndexOutOfBoundsException will be thrown
    *   e- The code will not compile
    *   f- None of the above
     */
}
