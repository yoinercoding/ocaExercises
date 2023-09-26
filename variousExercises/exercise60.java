package variousExercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class exercise60 {
    /*
     *       Java Programacion orientada a objetos OOP
     *
     *   Dados dos vectores de enteros, A y B, construir un tercer vector C que contengan la union de los dos
     *   anteriores.
     */
    public static void main(String[] args) {

    // Inicializamos Array A
    Integer[] A = {1, 2, 3};
        System.out.println("Array A : "+ Arrays.toString(A));

    // Inicializamos Array B
    Integer[] B = {2, 4, 6};
        System.out.println("Array B : "+ Arrays.toString(B));

    // Inicializamos Set y HastSet
    Set<Integer> unionDeArrays = new HashSet<>();

        unionDeArrays.addAll(Arrays.asList(A));

        unionDeArrays.addAll(Arrays.asList(B));

    Integer[] unionC = {};
    unionC = unionDeArrays.toArray(unionC);

        System.out.println("Union: "+ Arrays.toString(unionC));
    }
}