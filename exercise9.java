/*
*       Consider the following Java Code that creates an array of objects
*/
public class exercise9 {
    public void main(String[] args) {
        MyObject[] objects = new MyObject[5];
        for(int i = 0; i < objects.length; i++) {
            objects[i] = new MyObject(i+1);
        }
    }
    class MyObject {
        private int value;

        public MyObject(int value) {
            this.value = value;
        }
    }
}               // What's the purpose of the for loop in the code?

            /*
             *  a- it declares an array of 5 MyObject objects
             *  b- it initializes an array of 5 MyObject objects with null values
             *  c- it assigns an array of 5 MyObject objects to the objects variable
             *  d- it creates 5 MyObject objects with values 1 to 5 and assigns them to object array <--- Correct answer
             *  e- it declares and initializes an array of 5 MyObject objects with values
             *  f- it creates 5 MyObject objects but doesn't assign them to the objects array
             */
