import java.util.ArrayList;
import java.util.List;

public class exercise39 {
    public static void main (String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Yoiner");
        people.add("Bello");
        people.add("DNI: 12345678");
        people.add("Matias");
        people.add("Candeloro");
        people.add("DNI: 87654321");

        people.removeIf(name -> name.startsWith("M"));      // expresion lambda
        people.forEach(name -> System.out.println(name));   // expresion lambda

    }
}
