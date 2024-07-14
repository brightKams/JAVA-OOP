import java.util.Scanner;

public class IO_Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String CharData = "Hello";
        System.out.println((Object)CharData.getClass().getSimpleName());

        System.out.println("Your name is " + name + "\nYour age is " + age);

        // Performing Arithmetic with two different numerical Data Types:
        float floatNum = 4;
        int number = 4;
        System.out.println(((Object) (number / floatNum)).getClass().getSimpleName());

        // Converting One Numerical Data type to another: Example from "double" to
        // "int":

        float i3 = (float) 5.99;
        System.out.println(((Object) i3).getClass().getSimpleName());
        // The expression above returns "i3" as a "float"
        int i4 = (int) i3;
        // The Expression above returns "i3" as an "Integer"
        System.out.println(i4);
        System.out.println(((Object) i4).getClass().getSimpleName());

        sc.close();
    }
}
