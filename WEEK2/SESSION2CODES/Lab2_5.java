import java.util.Scanner;
public class Lab2_5 {
    
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {

            double principal, rate, amount;
            int years, year;
            System.out.print("Enter the initial amount in the Account: ");
            principal = input.nextDouble();
            System.out.print("Enter the Interest rate Here: ");
            rate = input.nextDouble();
            rate = rate/100;
            System.out.print("Rate is: " + rate + "\n");

            System.out.print("Enter the number of years: ");
            years = input.nextInt();

            System.out.print("Enter the initial Year: ");
            // year = input.nextInt();
            year = input.nextInt();

            amount = principal;
            System.out.printf("Principal: %.2f\tRate: %.2f\tNumber of Years: %d\nYear\tAmount\n", principal, rate, years);
            for (year = 1; year <=years; year++) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%d\t%.2f\n", year, amount);
                
            }
        };
    }
}
