/*
*       What will be the output of the following Java Code snippet?
*/
public class exercise23 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 2, result;
        if(a > b && a > c) {
            result = a + b + c;
        } else if (b > c && b > a) {
            result = a - b + c; // - 2 + 2 = 0
        } else {
            result = a * b * c;
        }
        System.out.println(result);
    }
}
/*
*       Output?
*   a- 70
*   b- -4
*   c- 0  <--- Correct answer
*   d- Compilation error
*   e- Runtime error
*/
