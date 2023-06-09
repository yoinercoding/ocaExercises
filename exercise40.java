public class exercise40 {
    /*
    *   What is the output of the following code that uses varargs to pass a variable number of int arguments to a method?
     */
    public static void main(String[] args) {
        exercise40 obj = new exercise40();
        obj.exercise40Test(1,2,3,4);
    }
    public void exercise40Test(int... a) {
        System.out.println(a[0] + a[1]); // <--- Suma la posicion 0 + la posicion 1, seria 1 + 2 = 3
    }
    /*
    *       Output?
    *   a- 1
    *   b- 2
    *   c- 3  <--- Correct answer
    *   d- 4
    *   e- 5
    *   f- Compilation error
     */
}
