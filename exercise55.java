import java.util.Scanner;

public class exercise55 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main (String[] args) {
        //Calcular aᵇ en forma iterativa, como sucesivas multiplicaciones
        Scanner sc = new Scanner(System.in);
        int num;

        do  {
            System.out.println("Introduce un numero entero mayor o = 0");
            num = sc.nextInt();
        } while(num < 0);
            System.out.println("2 ^ " + num + " = " + potencia(num));
    }

    public static double potencia(int n) {
        double res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * 2;
        }
        return res;
    }
}
