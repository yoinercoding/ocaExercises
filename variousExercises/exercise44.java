package variousExercises;

/*
*       Consider the following code
 */
public class exercise44 {
    int x = 5;
    public static void main(String[] args) {
        exercise44 dp = new exercise44();
        dp.updateX(dp.x);
        System.out.println("x is: " + dp.x);
    }

    public void updateX(int x) {
        x = x+2;  // para que se efectue la suma, tendria que ser con this.
    }
   /*
   *        Output?
   *    a- x is: 5 <--- correct answer
   *    b- x is: 7
   *    c- The code will not compile
   *    d- An exception will be thrown
    */

}
