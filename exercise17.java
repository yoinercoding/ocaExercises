/*
*       Consider the following Java code that creates a Car Object and then destroys it
*/
public class exercise17 {
    private String make;
    public exercise17(String make) {
        this.make = make;
    }
    public static void main(String[] args) {
        exercise17 myCar = new exercise17("Toyota");
        myCar = null;
    }
}

/*          What happens when the myCar object is set to null?
*   a- The car Object is not destroyed and remains in memory
*   b- The car Object is destroyed and its memory is freed
*   c- An error occurs when the myCar object is set to null
*   d- The car object becomes eligible for garbage collection but is not immediately destroyed <--- Correct answer
*   e- None of the above
*/
