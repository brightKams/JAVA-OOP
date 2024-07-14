package PROCEDURAL;
import java.util.Scanner;

public class task5 {
    

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

        
        
        while (age >=20 && age <=29) {
            if((int)bmr <=1400) {
                System.out.println("Normal");
                break;
            } else {
                System.out.println("Overweight");
                break;
            }
            
        }
        
        while ( age >= 30) {
            if((int)bmr <=1250) {
                System.out.println("Normal");
                break;
                
            } else {
                System.out.println("Overweight");
                break;
            }
           
        }

    }
}
