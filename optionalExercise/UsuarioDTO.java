package optionalExercise;

import java.util.Optional;

public class UsuarioDTO {

    private Optional<DireccionDTO> direccionDTO;

    public UsuarioDTO(Optional<DireccionDTO> direccion) {
        this.direccionDTO = direccion;
    }

    public Optional<DireccionDTO> getDireccion() {
        return direccionDTO;
    }
}
