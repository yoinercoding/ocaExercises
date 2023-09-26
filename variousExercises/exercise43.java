package variousExercises;/*
/       Given the following Java Class, which of the following method calls would be valid?
 */

public class exercise43 { //overloading
    public void doSomething(int a) {}
    public void doSomething(String s) {}
    public void doSomething(int a, String s) {}
}

/*
*       a- doSomething(1) <-- Correct answer
*       b- doSomething("hello") <-- Correct answer
*       c- doSomething(1, "hello") <-- Correct answer
*       d- Gives a compilation error
*       e- Gives a runtime exception
*       f- none of the above
 */
