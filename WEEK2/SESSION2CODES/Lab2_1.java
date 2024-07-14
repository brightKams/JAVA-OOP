import java.util.Scanner;

public class Lab2_1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter First number here: ");
        number1 = input.nextInt();
        System.out.println("Enter Second number here: ");
        number2 = input.nextInt();
        boolean condition = true;
        while(condition) {

            if( number1 == number2 ) {
                // System.out.println("NUMBER1 +  equals  + NUMBER2");
                System.out.println(number1 +  " equals "  + number2);
                break;
            } else if(number1 != number2) {
                System.out.println("NUMBER1 +  is not equal to  + NUMBER2");
                break;
                
            } else if(number1 > number2) {
                System.out.println("NUMBER1 +  is Greater than  + NUMBER2");
                break;
            } else if(number1 < number2) {
                System.out.println("NUMBER1 +  is less than  + NUMBER2");
                break;
            } else if(number1 >= number2)   {
                System.out.println("NUMBER1 +  is Equal to or Greater than  + NUMBER2");
                break;
            } else if(number1 <= number2)   {
                System.out.println("NUMBER1 +  is Less than or Equal to  + NUMBER2");
                break;
            }
            
        }
        input.close();
    }
}
