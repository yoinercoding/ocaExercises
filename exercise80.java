import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class exercise80 {
    /*
    *       SET y LIST
    *       En set el ordenamiento no esta asegurado, en list si.
    *
    *       Son interfaces que extienden de la interfaz Collection
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); //estructura mas utlizada en java para set (HASHSET) no admite duplicados
                                            // ya que deriva de Hashmap por lo tanto tiene clave(indice) y valor.
        List<String> list = new ArrayList<>(); //estructura mas utlizada en java para list (ARRAYLIST)

        //ejemplos
        set.add("Hola");   //solo se guarda este ya que no admite duplicados.
        set.add("Hola");
        set.add("Yoiner"); //se guarda
        set.add("Hola");

        list.add("Chao"); //guarda todos ordenadamente.
        list.add("Chao");
        list.add("Adios");


        for (String s : set) {
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
