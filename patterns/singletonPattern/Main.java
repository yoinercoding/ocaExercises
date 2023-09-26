package singletonPattern;
/*
*          Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase
*           tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
 */
public class Main {
    public static void main(String[] args) {
        UsuarioServicio usuarioServicio = new UsuarioServicio(Version.getInstance());
        CarritoDeCompraServicio carritoDeCompraServicio = new CarritoDeCompraServicio(Version.getInstance());
    }

    public static void otroMetodo() {
        Version version = Version.getInstance();
    }
}
