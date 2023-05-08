/*
*       Consider the following Java Code. What will be the output of the program?
*/
public class exercise20 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++); //5 print y luego incrementa
        System.out.println(++x); //7  incrementa y luego print
        System.out.println(x);  //7 print
        System.out.println(--x);   //6  decrementa y luego print
        System.out.println(x--); //6    print y luego decrementa
        System.out.println(x);  //5  print
    }
}
/*
*       Output?
*   a- 6 7 7 6 6 5
*   b- 5 7 7 6 6 5  <--- Correct answer
*   c- 5 6 6 6 6 5
*   d- 6 6 6 6 6 5
*/