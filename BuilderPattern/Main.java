package BuilderPattern;

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

        UsuarioDTO usuario2 = new UsuarioDTO.Builder()
                .nombre("Paula")
                .apellido("Gonzalez")
                .email("pgonzalez@gmail.com")
                .fechaDeNacimiento("1968-01-10")
                .genero("Femenina")
                .estadoCivil("Casada")
                .build();

        UsuarioDTO usuario3 = new UsuarioDTO.Builder()
                .nombre("Tatiana")
                .apellido("Perez")
                .email("tatianaperez@gmail.com")
                .fechaDeNacimiento("1980-01-02")
                .genero("Femenina")
                .estadoCivil("Viuda")
                .build();

        UsuarioDTO usuario4 = new UsuarioDTO.Builder()
                .nombre("Pablo")
                .apellido("Mcallister")
                .email("pmc@gmail.com")
                .fechaDeNacimiento("1968-01-10")
                .genero("Masculino")
                .estadoCivil("Casado")
                .build();

        UsuarioDTO usuario5 = new UsuarioDTO.Builder()
                .nombre("Romina")
                .apellido("Perez")
                .email("rm@gmail.com")
                .fechaDeNacimiento("1968-01-10")
                .genero("Femenina")
                .estadoCivil("Soltera")
                .build();
    }
}
