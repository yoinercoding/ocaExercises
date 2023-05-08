/*
*       What is the result of the following snippet?
*/
public class exercise24 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 4;
        int result = c++ - ++a + b-- * d; //multiplicamos primero, orden aritmetico.
        System.out.println(result);
    }
}
/*
*       Output?
*   a- 10 <---- Correct answer
*   b- 15
*   c- 16
*   d- 17
*   e- 18
*   f- 19
*/
