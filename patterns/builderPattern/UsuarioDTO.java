package builderPattern;
import java.util.Objects;

//////////////////////////////////////////////////BUILDER PATTERN///////////////////////////////////////////////////
public class UsuarioDTO {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String fechaDeNacimiento;
    private final String genero;
    private final String estadoCivil;

    public UsuarioDTO(String nombre, String apellido, String email,
                      String telefono, String fechaDeNacimiento,
                      String genero, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }

    public UsuarioDTO(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.fechaDeNacimiento = builder.fechaDeNacimiento;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;
    }
    public static class Builder {
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private String fechaDeNacimiento;
        private String genero;
        private String estadoCivil;

        public UsuarioDTO.Builder nombre(String nombre) {
            Objects.requireNonNull(nombre);
            this.nombre = nombre;
            return this;
        }

        public UsuarioDTO.Builder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public UsuarioDTO.Builder email(String email) {
            this.email = email;
            return this;
        }

        public UsuarioDTO.Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public UsuarioDTO.Builder fechaDeNacimiento(String fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }

        public UsuarioDTO.Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public UsuarioDTO.Builder estadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }

        public UsuarioDTO build() {
            if(nombre == null) {
                nombre = "";
            }
            return new UsuarioDTO(this);
        }
    }
}

