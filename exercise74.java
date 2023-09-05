import java.util.Scanner;

public class exercise74 {
    /*
    *       Print reverse number in Java
    *
     */
    public static void main(String[] args) {
        int n, reverse = 0;
        System.out.println("Ingresar un numero: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        System.out.println("El numero invertido es: " + reverse);
    }
}
