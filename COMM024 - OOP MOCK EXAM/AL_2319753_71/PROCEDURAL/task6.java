package PROCEDURAL;
import java.util.Scanner;
public class task6 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;

        System.out.println("Enter count: ");
        count = input.nextInt();
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println(count);
            count -= 1;
            if (count == 0) {
                continueLoop =false;
            }
        }

        input.close();
    }
}
