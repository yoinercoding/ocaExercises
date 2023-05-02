/*
*       Consider the following Java code
*/
public class exercise8 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(10);
        Integer c = a;

        System.out.println(b == a);  //true
        System.out.println(b == c);  //false
    }
}                   // What's the output of the code?

        /*
        *   a- True, false <---- Correct answer
        *   b- False, true
        *   c- True, true
        *   d- False, false
        *   e- Compilation error
        *   f- Runtime error
        *
        *       note: el primero devuelve true ya que Java esta haciendole un unboxing, transforma la clase Integer
        *                en un primitivo, los compara y como son iguales devuelve True. El segunda da false ya que
        *                Java esta haciendo un Boxing, agarra el primitivo y lo convierte en un Integer... false
        *                por que esta comparando 2 objetos diferentes de una misma clase.
        */
