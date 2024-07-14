import java.util.Scanner;

public class IO_Demo2 {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your name");
    //     String name = sc.next();
    //     System.out.println("Enter your age");
    //     int age = sc.nextInt();
    //     System.out.println("Your name is " + name + " You age is " + age);
    //     sc.close();

    // }

    public static void main(String[] args){
        int i1, i2, remainder, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        i1 = input.nextInt();
        System.out.println("Enter the second number");
        i2 = input.nextInt();
        result = i1/i2;
        remainder = i1 % i2;
        System.out.println("The result for (i1/i2) is " + result);
        System.out.println("The remainder for (i1/i2) is remainder " + remainder);
        input.close();
        //we can make this output more attractive!
        System.out.printf("The result for (%d/%d) is %d\n", i1, i2, result);
        System.out.printf("The remainder for (%d/%d) is %d\n", i1, i2, remainder);

        System.out.printf("The result for (%d/%d) is %4.2f\n", i1, i2, i1*1.0/i2*1.0);


    }
}
