package optionalExercise;

import java.util.Optional;

public class exercise80 {
    /*
    *       OPTIONAL
    *       El concepto de Java Optional hace referencia a una variable que puede tener un valor asignado o que puede
    *       contener un valor null. En muchas casuísticas nos encontramos con situaciones en las que un valor puede
    *       devolver nulo . Ante esta situación los programadores están obligados a comprobar si la variable es null
    *       antes de acceder a su valor. Ya que en el caso de ser nula e intentar acceder a algunas de sus propiedades
    *       el programa falla y lanza una excepción de java.lang.NullPointerExcepcionh
     */
    public static void main(String[] args) {
        Optional<String> stringNull = Optional.ofNullable(null);
        Optional<String> stringOptional = Optional.of("Hola");

        if(stringNull.isEmpty()) {
            System.out.println("El String null esta vacio");
        }
        if(stringOptional.isEmpty()) {
            System.out.println("El String option esta vacio");
        }

        String stringGet = stringOptional.get(); //trae el valor del stringOptional creado arriba
        System.out.println(stringGet);
    }
}
