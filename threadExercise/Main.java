package threadExercise;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola soy el hilo principal " + LocalDateTime.now());

        HiloEjemplo hiloEjemplo = new HiloEjemplo();
        hiloEjemplo.start();

        EjecutableEjemplo ejecutableEjemplo = new EjecutableEjemplo();
        Thread thread = new Thread(ejecutableEjemplo);
        thread.start();

        System.out.println("Adios soy el hilo principal " + LocalDateTime.now());
    }
}
