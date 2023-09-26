package variousExercises;/*
*           Consider the following code
*/

public class exercise6 {
    private String make;
    private String model;
    private int year;

    public exercise6(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {

        exercise6 objCar = new exercise6("Honda", "Civic", 2020);

        System.out.println(objCar.getMake());
        System.out.println(objCar.getModel());
        System.out.println(objCar.getYear());

    }
}
            /*              Which of the following statements instantiates a Car Object?
            *       a- Car c = new Car();
            *       b- Car c = new Car("Honda", "Civic", 2020); <---- Correct answer
            *       c- Car c = Car();
            *       d- Car c = Car("Toyota", "Corolla", 2019);
            *       e- Car c = Car.new("Mazda", "CX-5", 2021);
            *       f- Car c = createObject("Nissan", "Sentra", 2018);
            *
            *   NOTA: en el codigo sale creado el constructor, por eso la opcion B es la correcta...
            * si no fuese estado creado, Java genera un constructor por Default y entonces la opcion correcta
            * seria la A.
            */
