import java.util.Scanner;
public class HelloWorld2 {
    

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Enter a name: ");
        // String num1 = input.next();
        // System.out.println("Your name is " + num1);



        // System.out.println("Enter a number: ");
        // int num2 = input.nextInt();
        
        // System.out.println("Enter a decimal: ");
        // double num3 = input.nextDouble();
        
        // System.out.println("Enter a number: ");
        // float num4 = input.nextFloat();

        // System.out.println("\n\n" + num1 + " " + num2 +"\n" + num3 + " " + num4);
        
        String hello = "Hello world";
        System.out.printf(hello + "\n\n\n");


        // CONVERTING TO DIFFERENT DATA TYPES
        
        int newNum = 5;
        System.out.println(newNum);
        System.out.println(((Object)newNum).getClass().getSimpleName() + "\n");
        float newFloat = (float) newNum;
        System.out.println(newFloat);
        System.out.println(((Object)newFloat).getClass().getSimpleName());

        // INCREMENTATION
        int number = 7;
        // ++number;
        // ++number   index++, index = index + 1;
        System.out.println("\n\n" + ""+ number++);
        System.out.println("\n\n" + ""+ number);
        number = 3;
        System.out.println("\n\n" + ""+ number);

        System.out.println(FIRSTNAME);
        int currentAge = input.nextInt();
        String helloYou = hello("Bright", currentAge);
        System.out.println(helloYou);
        input.close();
    }   
    // DECLARING CONSTANT VARIABLES IN JAVA
    public static final String FIRSTNAME = "Bright";
    private static String hello(String name, int age) {
        String message = "Hello are you there! " + name + "\nYou are " + age + " years old" ;
        System.out.println(((Object)message).getClass().getSimpleName());
        return message ;

    }
}


