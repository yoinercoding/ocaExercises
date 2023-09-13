import java.io.IOException;

public class exercise79 {
    public static void main(String[] args) {

        // Exception
        try {
            int x = 5 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Error: no se puede dividir por cero! \n" + e);
        }
    }
}
