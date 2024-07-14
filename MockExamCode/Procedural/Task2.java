import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Divident");
        double dividend = input.nextDouble();
        System.out.println("Enter Divisor");
        double divisor = input.nextDouble();
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        double res = quotient - divisor;
        System.out.println("Quotient: " + (int) quotient + " Remainder:  " + (int) remainder + " res = " + (int) res);
        input.close();

    }

}
