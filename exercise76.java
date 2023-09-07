import java.math.BigInteger;
import java.util.Scanner;

/*
*       Calculate factorial with BigInteger
 */

public class exercise76 {

    public static void main(String[] args) {
        int n, c;
        BigInteger num = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar un numero entero: ");
        n = in.nextInt();

        for(c = 1; c <= n; c++) {
            fact = fact.multiply(num);
            num = num.add(BigInteger.ONE);
        }

        System.out.println(n + "! = " + fact);
    }
}
