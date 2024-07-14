import java.util.Scanner;
public class Task1 {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String first_name;
        String last_name;
        int id;

        System.out.println("Enter First name: ");
        first_name = input.nextLine();
        System.out.println("Enter Lasat name: ");
        last_name = input.nextLine();
        System.out.println("Enter your ID: ");
        id = input.nextInt();

        System.out.printf("First Name: %s\t Last Name: %s\t ID: %d", first_name, last_name, id);

        input.close();
        

    }

}
