package variousExercises;

public class exercise34 {
    /*
    *   Consider the following Java code:
     */
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int[] arr2 = arr;
        arr2[0] = 6;
        System.out.println(arr[0]);
    }
    /*
    *       What will be printed to the console when the main method is executed?
    *   a- 1
    *   b- 2
    *   c- 3
    *   d- 4
    *   e- 5
    *   f- 6  <--- Correct answer
     */
}
