import java.util.Optional;

public class exercise80 {
    /*
    *       OPTIONAL
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
