import java.util.ArrayList;

public class Task8 {
    
public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    // Adding Items into the ArrayList
    cars.add("Toyota");
    cars.add("Honda");
    cars.add("BMW");
    cars.add("Ford");

    for (String car : cars) {
        System.out.println(car);
    }
    // System.out.println(cars);

    System.out.println("\n\n" + cars.get(0) + "\n"+ cars.get(1) + "\n"+ cars.get(2));
    // System.out.println(cars.get(1));
    // System.out.println(cars.get(2));
    
   
}

}
