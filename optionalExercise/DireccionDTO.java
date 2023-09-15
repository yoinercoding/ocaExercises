package optional;

import java.util.Optional;

public class DireccionDTO {
    private Optional<DireccionDTO> direccion;

    public DireccionDTO(Optional<DireccionDTO> direccion) {
        this.direccion = direccion;
    }

    public Optional<DireccionDTO> getDireccion() {
        return direccion;
    }
}
