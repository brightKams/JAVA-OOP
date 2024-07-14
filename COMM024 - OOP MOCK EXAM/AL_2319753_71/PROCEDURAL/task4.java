package PROCEDURAL;
import java.util.Scanner;
public class task4 {
   
    
    public static void main(String[] args) {
        double height, weight, bmr;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight: ");
        weight = input.nextDouble();
        System.out.println("Enter Height: ");
        height = input.nextDouble();
        System.out.println("Enter age: ");
        age = input.nextInt();

        bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);


        System.out.println("Weight: " + weight +"kg" + " Height: " + height + "cm" + " Age: " + age + "years" + " BMR: " + bmr);
        input.close();
    }
}
