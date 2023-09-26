package variousExercises;
/*
 *    Given the following Java Class, which option best describes the output of the program
 */

public class exercise4 {
    private int x;
    public exercise4(int x) {
        this.x = x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        exercise4 obj = new exercise4(5);
        obj.setX(10);
            System.out.println(obj.getX());
    }
}

        /*
        * a- The program outputs 5
        * b- The program outputs 10  <---- Correct answer
        * c- The program does not compile
        * d- The program throws a runtime exception
        * e- The output of the program cannot be determinated
        */
