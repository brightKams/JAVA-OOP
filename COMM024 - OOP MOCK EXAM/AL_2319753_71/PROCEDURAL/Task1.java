package PROCEDURAL;
import java.util.Scanner;
public class Task1 {
    


    public static void main(String[] args) {
        String first_name, surname;
        int id;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        first_name = input.nextLine();
        System.out.println("Enter your Surname: ");
        surname = input.nextLine();
        System.out.println("Enter your ID: ");
        id = input.nextInt();

        System.out.println("First Name: " + first_name + " Surname: " + surname + " ID: " + id);



        input.close();
    }
}
