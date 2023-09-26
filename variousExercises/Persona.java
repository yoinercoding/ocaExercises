package variousExercises;

public class Persona {
    /*
    *       Ejemplo Patron de diseño Builder.
    *           Con lombok genera automáticamente el código de construcción con las anotaciones @Data y @Builder
    *
     */
    private String nombre;
    private int edad;
    private String direccion;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
    }

    public static class Builder {
        private String nombre;
        private int edad;
        private String direccion;

        //getter and setters
        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }
    Persona persona = new Persona.Builder()
            .nombre("Juan")
            .edad(30)
            .direccion("Calle Principal")
            .build();
}
