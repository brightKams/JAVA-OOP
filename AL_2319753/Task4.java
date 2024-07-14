import java.util.Scanner;

public class Task4 {
    

    public static void main(String[] args) {
        double weight, height, bmr;
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Weight");
        weight = input.nextDouble();
        System.out.println("Enter your Height");
        height = input.nextDouble();
        System.out.println("Enter your Age");
        age = input.nextInt();

        bmr =  88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);

        System.out.printf("Weight: %.2f Height: %.2f Age: %d + BMR = %.2f", weight, height, age, bmr);

        input.close();
    }
    
}
