package variousExercises;

import java.util.ArrayList;
import java.util.List;

public class exercise29 {
    public static void main(String[] args) {
        List<Double> one = new ArrayList<>();
        one.add(10.1);
        one.add(new Double(30.1));
        one.remove(10.1);
        double first = one.get(0);
    }
}

