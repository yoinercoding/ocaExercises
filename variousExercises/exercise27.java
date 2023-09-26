package variousExercises;

import java.util.Locale;

public class exercise27 {
    //Diferentes funciones de la clase String
    public static void main(String[] args) {
        String text = "Hola esto es un ejemplo :D";
        System.out.println(text.charAt(0)); // H
        System.out.println(text.length()); // 26
        System.out.println(text.toUpperCase(Locale.ROOT)); // HOLA ESTO ES UN EJEMPLO :D
        System.out.println(text.concat(" add")); // Hola esto es un ejemplo :D add
        System.out.println(text.contains("to")); // true
        System.out.println(text.replace("a", "z")); // Holz esto es un ejemplo :D
        System.out.println(text.startsWith("hola")); // false
        System.out.println(text.indexOf("m")); // 19
        System.out.println(text.substring(3)); // a esto es un ejemplo :D
        System.out.println(text.substring(2,5)); // la
        System.out.println(text.equalsIgnoreCase("Hola esto")); //false

        System.out.println(text.split(" ")); // genera arreglo con las palabras sin espacio
        String[] words = text.split(" ");

        for(String w : words) {
            System.out.println(w);  //mostramos el contenido del arreglo
        }
    }
}
