public class exercise57 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main(String[] args) {
        //Desarrollar un algoritmo que calcule la suma de los elementos de un vector de enteros.
        int miArray[] = {0, 5, 6, 8, 9};
        int sum = 0;

        for(int i : miArray) {
            sum += i;
        }
            System.out.println("La suma de los elementos es: " + sum);
    }
}
