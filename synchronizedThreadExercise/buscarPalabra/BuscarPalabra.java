package synchronizedThreadExercise.buscarPalabra;

/*
 *                                           Synchronized Thread
 *   Los metodos sincronizados en Java solo pueden tener un hilo ejecutandose dentro de ellos al mismo tiempo.
 *   Son necesarios cuando un metodo accede a un recurso que puede ser consumido por un unico proceso.
 *   Para evitar que un algoritmo sea ejecutado por mas de un hilo en forma simultanea, Java nos permite definir
 *   un metodo con el modificador synchronized.
 *   Cuando un metodo se lo define synchronized luego solo un hilo puede estar ejecutandolo en un mismo momento.
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabra implements Runnable {
    private String palabra;
    private Thread hilo;
    private int cant;

    /*
     *   En el constructor recibimos la palabra a buscar, creamos el hilo y mientras el mismo no finalice
     *      no se procede a mostar el contador de palabras.
     */
    public BuscarPalabra(String palabra) {
        this.palabra = palabra;
        hilo = new Thread(this);
        hilo.start();
        while (hilo.isAlive())
            ;
        System.out.println("La palabra " + palabra + " se encuentra contenida en " +
                cant + " archivos");
    }

    /*
     *   Se inicia al llamar al metodo 'start' del hilo... procedemos a obtener todos los archivos del directorio a
     *      procesar y llamamos al metodo 'tiene' para cada uno de los archivos de texto
     */
    @Override
    public void run() {
        File ar = new File("C:\\Users\\ybello\\Documents\\");
        String[] directorio = ar.list();
        for (String arch : directorio) {
            if (tiene(arch)) {
                cant++;
                System.out.println(arch);
            }
        }
    }

    /*
     *   El metodo 'tiene' es el metodo sincronizado, el cual evita que dos hilos puedan en forma simultanea acceder al
     *       sistema de archivos.
     *       Abrimos, leemos el archivo de texto y buscamos en cada linea si tiene la palabra
     */
    private synchronized boolean tiene(String archivo) {
        boolean existe = false;
        try {
            FileReader fr = new FileReader("C:\\Users\\ybello\\Documents\\" + archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                if (linea.indexOf(palabra) != -1)
                    existe = true;
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return existe;
    }

    /*
     *    Indicamos las palabras a buscar
     */
    public static void main(String[] ar) {
        new BuscarPalabra("no");
        new BuscarPalabra("nb-ybello1");
    }
}