package variousExercises;

public class exercise51 {
    /*
    *       Java Programacion orientada a objetos OOP
    */
    public static void main (String[] args) {
        //output?
        int i;
        for (i = 1; i < 10; i++) {
            if ((i % 2) == 0) continue;
                System.out.println(i); //1, 3, 5, 7, 9
        }
            System.out.println("Valor de i: " + i); // 10
    }
}
