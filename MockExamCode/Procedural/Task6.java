import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nNumber of time to run the loop");
        int times = input.nextInt();

        for (int i = 0; i < times; i++){
            System.out.println("Count = " + (i + 1));
        }
        System.out.println();

        input.close();

    }

}
