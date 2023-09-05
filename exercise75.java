import java.util.Scanner;

public class exercise75 {
    /*
    *       While loop using break and continue Program in Java
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Introduce un numero entero: ");
            n = input.nextInt();

            if (n != 0) {
                System.out.println("Tu numero es: " + n);
                continue;
            } else {
                break;
            }
        }
    }
}
