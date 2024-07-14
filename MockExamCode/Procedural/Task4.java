import java.util.Scanner;

public class Task4 {

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
        input.close();
    }

    /*
     * • Men: BMR = 88.362 + (13.397 x weight in kg) + (4.799 x height in cm) –
     * (5.677 x age in years)
     * • Women: BMR = 447.593 + (9.247 x weight in kg) + (3.098 x height in cm) –
     * (4.330 x age in years)
     * 
     */

}
