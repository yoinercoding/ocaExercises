package optionalExercise;

import java.util.Optional;

public class DireccionDTO {
    private Optional<String> direccion;

    public DireccionDTO(Optional<String> direccion) {
        this.direccion = direccion;
    }

    public Optional<String> getDireccion() {
        return direccion;
    }
}
