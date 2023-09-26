package variousExercises;

import java.io.IOException;
import java.sql.SQLException;
/*
*           EJEMPLOS DE EXCEPTIONS
 */
public class exercise45 {
    public static void main(String[] args) {
        try {
            doSomething(3);
        } catch(SQLException e) {
            System.out.println(e);
        } catch(IOException e) {

        }
    }

    public static void doSomething(int x) throws SQLException, IOException {
        if( x > 10) {
            throw new SQLException();
        } else {
            throw new IOException();
        }
    }
}
