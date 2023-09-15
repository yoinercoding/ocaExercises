package optionalExercise;

import java.util.Optional;

public class Usuario {

    private Optional<DireccionDTO> direccionDTO;

    public Usuario(Optional<DireccionDTO> direccion) {
        this.direccionDTO = direccion;
    }

    public Optional<DireccionDTO> getDireccion() {
        return direccionDTO;
    }
}
