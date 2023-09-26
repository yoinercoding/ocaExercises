package threadExercise;

import java.time.LocalDateTime;

/*
*                                                   Threads
*     La maquina virtual JVM es un sistema multihilo. Es decir, es capaz de ejecturar varios hilos de ejecucion
*   simultaneamente. La JVM gestiona todos los detalles, asignacion de tiempos de ejecucion, prioridades, etc. De forma
*   similar a como gestiona un sistema operativo multiples procesos. La diferencia basica entre un proceso de Sistema
*   operativo y un Thread Java es que los hilos corren dentro de la JVM, que es un sistema operativo y por tanto
*   comparten todos los recursos, incluida la memoria, variables, objetos definidos.
*
*   Desde el punto de vista de las aplicaciones los hilos son utiles por que permiten que el flujo del programa sea
*   dividido en dos o mas partes, cada una ocupandose de alguna tarea de forma independiente. Por ejemplo, un hilo
*   puede encargarse de la comunicacion con el usuario, mientras que otros actuan en segundo plano, realizando la
*   transmision de un fichero, accediendo a recursos del sistema.
*
 */

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
