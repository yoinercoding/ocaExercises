package compositePattern;

import java.util.function.Consumer;

public class Boton implements ElementoBoton {
    @Override
    public void dibujar() {
        System.out.println("Dibujando boton");
    }

    @Override
    public <T> void click(Consumer<T> consumer) {
        consumer.accept(null);
    }

    @Override
    public int getColor() {
        return 0;
    }
}
