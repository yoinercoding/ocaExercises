import java.util.Scanner;

public class exercise72 {
    /*
     *   Question based on JAVA Programming Language (Book)
     *             Find Largest no in Java
     */
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Ingresar 3 numeros: ");
        Scanner i = new Scanner(System.in);

        x = i.nextInt();
        y = i.nextInt();
        z = i.nextInt();

        if (x > y && x > z) {
            System.out.println("El primer numero es el mas grande.");
        } else if (y > x && y > z) {
            System.out.println("El segundo numero es el mas grande.");
        } else if (z > x && z > y) {
            System.out.println("El tercer numero es el mas grande.");
        } else {
            System.out.println("Los numeros ingresados no son distintos.");
        }
    }
}
