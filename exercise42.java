/*
*       Given the following code, which of the following options correctly assigns a lambda expression to the functional
*       interface 'MyInterface'?
 */
    interface MyInterface {
        void myMethod(int x);
    }
    public class exercise42 {
        public static void main(String[] args) {
            MyInterface myLambda = x -> System.out.println(x);
        }
    }

        /*
        *       a- MyInterface mylambda = x -> System.out.println(x); <--- Correct answer
        *        b- MyInterface mylambda = x -> {System.out.println(x);}; <--- Correct answer
        *         c- MyInterface myLambda = (int x) -> {System.out.println(x);}; <--- Correct answer
        *           d- MyInterface myLambda = (int x) -> x;
        *             e- MyInterface myLambda = () -> System.out.println("Hello world");
        *               f- None of the above
         */


