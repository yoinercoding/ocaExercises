package variousExercises;

public class exercise11 {
    public static void main(String[] args) {
        //se necesita el casteo a int, si no como double es un tipo de dato mayor a int daria error
        int x = (int)1.0; // RESULTADO = 1

        //el --x entra valiendo 1, como lo restamos valdria 0... el x++ al estar de ultimo no se ejecuta
        x = 2 *(10 - --x) + x++; // RESULTADO = 20

        x = (x=2) + (x=3); // RESULTADO = 5

        //en este punto X vale 5, por lo tanto la comparacion no es verdadera y devuelve FALSE
        boolean flag = x==(long)100; //RESULTADO FALSE

        /*  flag estaba como FALSE, pero en el IF le estamos asignando que vale directamente TRUE... por lo tanto
        *   estamos pisando el dato. El resultado de la operacion aritmetica es 3,
        *   luego lo concatena con X que vale 5, por ende el resultado es 53
        */

        if(flag = true) {
            System.out.println("Result " + x +(1+2));
        }
    }
}
