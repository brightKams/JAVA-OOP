import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = input.nextLine();
        System.out.println("Enter your surname");
        String surname = input.nextLine();
        System.out.println("Enter your ID");
        int ID = input.nextInt();
        System.out.println("First Name: " + firstname
                + " Surname: " + surname 
                + " ID: " + ID);
        input.close();
    }

}
