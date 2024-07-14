import java.util.*;
// import java.util.Scanner;
public class IO_Demo {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        // System.out.println(name);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // float ages = sc.nextFloat();
        // System.out.println(ages);
        System.out.println("Your name is " + name
                + " Your age is " + age);
// int, float, double, boolean, String

        sc.close();
    }
}