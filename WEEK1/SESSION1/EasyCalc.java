import java.util.Scanner;

public class EasyCalc {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your last name: ");
        String lname = input.next();

        System.out.printf("Your name is %s %s\n",name, lname);
        System.out.println("Your name is " +  name + " " + lname);

        double x, y, z, result;
        // x = 5; y =6; z = 7;
        System.out.print("Enter first number: ");
        x = input.nextDouble();
        System.out.print("Enter second number: ");
        y = input.nextDouble();
        System.out.print("Enter third number: ");
        z = input.nextDouble();
        result = (x * y * z);
        System.out.println(((Object)result).getClass());
        System.out.println(((Object)result).getClass().getSimpleName());
        System.out.printf("result is %.3f\n", result);
        System.out.printf("%f %f %f\n", x, y, z);
    
        // System.out.printf("%f, %f, %f\n", x, y, z);
    
    
    input.close();
    }


}
