package observerPattern;

public class Ejemplo3Observer implements Observer {
    @Override
    public void update() {
        System.out.println("Se ha llamado al Ejemplo 3");
    }
}
