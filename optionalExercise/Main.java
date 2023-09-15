package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(Optional.of(direccionDTO));
        DireccionDTO direccion = new DireccionDTO(Optional.of("Calle Amenabar"));
    }
}
