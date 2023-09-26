package threadExercise;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class EjecutableEjemplo implements Runnable {
    @Override
    public void run() {
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(1000, 7000 + 1);
            System.out.println("Hola soy un ejecutable, implemento Runnable " + LocalDateTime.now());
            Thread.sleep(randomNum);
            System.out.println("Adios soy un ejecutable, implemento Runnable " + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
