/*
*       What is the output of the following code snippet?
*/
public class exercise21 {
    public static void main(String[] args) {
        /*  Operaciones binarias
        *   1 = 0001
        *   2 = 0010
        *   3 = 0011
        *   4 = 0100
        *   5 = 0101
        *   6 = 0110
        */
        int a = 4, b = 2;
        System.out.println(a | b); // 6
        System.out.println(a & b); // 0
        System.out.println(a ^ b); // 6
    }
}
/*
*       Output?
*   a- 6 2 2
*   b- 4 2 2
*   c- 6 0 6
*   d- 4 0 6
*   e- 4 2 6
*   f- none of the above
*/
