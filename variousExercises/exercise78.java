package variousExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercise78 {
    /*
    *       Streams
    *       Los Java Streams, no son estructuras de datos, sino envolturas alrededor de las fuentes de datos
    *       y nos permiten procesar los datos de manera más eficiente.
     */
    public static void main(String[] args) {

        Stream<String> streamDeStrings = Stream.of("Mauricio", "Belen", "Melisa", "Leonardo", "Matias", "Yoiner")
                .filter(s -> s.contains("a"))
                .map(s -> s.toLowerCase());


        List<String> lista = streamDeStrings.collect(Collectors.toList());
        System.out.println("Stream con filter y map = " + lista);

        Long streamDeLong = Stream.of("Un long", "Dos long", "Tres long")
                .count();

        boolean streamDeBoolean = Stream.of("Un boolean", "Dos boolean", "Tres boolean")
                .anyMatch(s -> s.contains("U"));

        System.out.println("Strean de boolean = " + streamDeBoolean);
        System.out.println("Stream de long = " + streamDeLong);

        //////////////////////////////////////////////////////////////////////////////////////

        List<String> lista2 = Arrays.asList("Antonio", "Maria", "Juan", "Pedro");
        System.out.println("Stream con ArrayList = " + lista2);

    }
}
