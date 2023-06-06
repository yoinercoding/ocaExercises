public class exercise31 {

    /*
    *       Consider the following code snippet
     */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        String str4 = str1 + str2;

        if (str3 == str4) {  // <---- Si bien los dos strings son iguales, el == funciona para comparar objetos. Por lo tanto es false
            System.out.println("A");
        } else if(str3.equals(str4)){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }

    /*
    *       What is the output of the above code?
    *   a- A
    *   b- B <--- Correct answer, para comparar objetos se usa el equals.
    *   c- C
    *   d- None of the above
     */
}
