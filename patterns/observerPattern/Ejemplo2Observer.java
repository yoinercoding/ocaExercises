package patterns.observerPattern;

public class Ejemplo2Observer implements Observer {
    @Override
    public void update() {
        System.out.println("Se ha llamado al Ejemplo 2");
    }
}
