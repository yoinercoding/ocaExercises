package exampleBuilderPattern;

public class Main {
    /*
    *  Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso.
    *  El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.
     */
    public static void main(String[] args) {
        UsuarioDTO usuario1 = new UsuarioDTO.Builder()
                .nombre("Juan")
                .apellido("Rodriguez")
                .email("juanrodriguez@gmail.com")
                .fechaDeNacimiento("1998-01-19")
                .genero("Masculino")
                .estadoCivil("Soltero")
                .build();
    }
}
