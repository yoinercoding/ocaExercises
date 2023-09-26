package threadExercise;

public class NombreThread extends Thread {

    public NombreThread(String str) {
        super(str);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        new NombreThread("Pepe").start();
        new NombreThread("Pedrito").start();
        new NombreThread("Juanita").start();
        new NombreThread("Sabrina").start();

        System.out.println("Termina thread main \n");
    }
}
