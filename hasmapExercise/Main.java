package hasmapExercise;

import java.util.HashMap;

    /*
    *       En Java se usa HashMap para almacenar elementos en pares clave/valor y puedes acceder a estos elementos
    *           almacenados en un HashMap utilizando la clave del elemento, que es única para cada elemento.
    *       Caracteristicas principales:
    *           - Los elementos se almacenan en pares clave/valor
    *           - Los elementos no mantienen ningun orden cuando se agregan. Los datos estan desordenados.
    *           - En caso de que hayan claves duplicadas, la ultima anulara a las otras.
    *           - Los tipos de datos se especifican utilizando clases contenedores en lugar de tipos de datos primitivos.
    */

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1000, "Juan");
        hash.put(3000, "Ana");
        hash.put(1500, "Pepe");

        System.out.println(hash);

        System.out.println(hash.get(1000)); //juan

        hash.remove(1500); //borramos pepe

        System.out.println(hash);

        if(hash.containsKey(1000)) {
            System.out.println("Contiene un indice de 1500 y su valor es " + hash.get(1000));
        } else {
            System.out.println("No hay un valor con el indice indicado ");
        }

        for(Integer indice : hash.keySet()) { //iteramos nuestro hashmap
            System.out.println(hash.get(indice));
        }
    }
}
