import java.util.Scanner;

public class Task5 {
    



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

        boolean continue_loop = true;
        while (continue_loop) {
            if (age >=20 && age <=29 && bmr <= 1400) {
                System.out.println("Normal");
                continue_loop = false;
            }else {
                System.out.println("Overweight");
                continue_loop = false;
            }
        }
        while (continue_loop) {
            if (age >=30 && bmr <= 1250) {
                System.out.println("Normal");
                continue_loop = false;
            }else if (age >=30 && bmr > 1250) {
                System.out.println("Overweight");
                continue_loop = false;
            }
        }
        input.close();
    }
}
