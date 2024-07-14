package PROCEDURAL;
import java.util.Scanner;
public class Task2 {
    

    public static void main(String[] args) {
        double dividend, divisor, quotient, remainder;
        int result;
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter First Decimal Number: ");
        dividend = input.nextInt();
        System.out.println("Enter Second Decimal Number: ");
        divisor = input.nextInt();

        quotient = dividend/divisor;
        remainder = dividend % divisor;

        result = (int) (quotient - divisor);


        System.out.println("Quotient = " + (int)quotient + " Remainder: " + remainder + " Result: " + result);
        input.close();
    }
    
}
