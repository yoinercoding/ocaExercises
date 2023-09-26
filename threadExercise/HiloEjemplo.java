package threadExercise;

import javax.swing.plaf.TableHeaderUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class HiloEjemplo extends Thread{
    @Override
    public void run() {
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 10000 + 1);
            System.out.println("Hola soy un hilo, extiendo de Thread " + LocalDateTime.now());
            Thread.sleep(randomNum);
            System.out.println("Adios soy un hilo, extiendo de Thread " + LocalDateTime.now());

        } catch (InterruptedException e ) {
            e.printStackTrace();
        }
    }
}
