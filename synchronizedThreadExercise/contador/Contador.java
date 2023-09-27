package synchronizedThreadExercise.contador;

public class Contador {
    private int contador = 0;

    /*
    *   Si distintos hilos estan llamando a este metodo al nombrarlo synchronized se ejecuta primero el hilo1, espera
    *   a que termine y luego se ejecuta el hilo2.
    *       Puede ser llamado tanto el metodo como en bloque. Ej: synchronized(this) {contador++;}, dará el mismo
    *   resultado.
     */
    public synchronized void sumar() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}
