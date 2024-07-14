package PROCEDURAL;
import java.util.ArrayList;

public class Task8 {
    

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);
        
        for (String car : cars) {
            System.out.println(car);
        }
    }

}
