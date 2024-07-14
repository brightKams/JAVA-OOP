import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your weight");
        double weight = input.nextDouble();
        System.out.println("Enter your height (cm)");
        double height = input.nextDouble();
        System.out.println("Enter your age");
        int age = input.nextInt();
        double bmr = 88.362+(13.397*weight)+(4.799*height)-(5.677*age);
        System.out.printf("Weight: %.2f  Height:  %.2f  Age: %d  BMR:  %.2f\n", weight, height, age, bmr);
        if(age < 30 && bmr <= 1400){
            System.out.println("Normal");
        }else if (age < 30 && bmr > 1400){
            System.out.println("Overweight");
        }else if (age >= 30 && bmr < 1250){
            System.out.println("Normal");
        }else if (age >= 30 && bmr > 1250){
            System.out.println("Overweight");
        }
        input.close();

    }
    
}
