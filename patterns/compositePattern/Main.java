package patterns.compositePattern;

public class Main {
    /*
    *       Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y
    *       trabajar con esas estructuras como si fueran objetos individuales.
    *       El uso del patrón Composite sólo tiene sentido cuando el modelo central de tu aplicación puede representarse
    *       en forma de árbol.
    *       La gran ventaja de esta solución es que no tienes que preocuparte por las clases concretas de los objetos
    *       que componen el árbol.
    *       No tienes que saber si un objeto es un producto simple o una sofisticada caja. Puedes tratarlos a todos por
    *       igual a través de la interfaz común. Cuando invocas un método, los propios objetos pasan la solicitud a lo
    *       largo del árbol.
     */
    public static void main(String[] args) {
        ElementoBoton boton = new Boton();
        ElementoGrafico campoDeTexto = new CampoDeTexto();
        ElementoGrafico contenedor = new Contenedor();

        campoDeTexto.dibujar();
        contenedor.dibujar();

        boton.dibujar();
        boton.click(o -> System.out.println("El bonton se ha clickeado"));
        boton.getColor();
    }
}
