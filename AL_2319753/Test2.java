import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        name = input.nextLine();

        TestClass myTest = new TestClass("Bright", "Ab2319753");

        System.out.println( myTest.getName());
        
    }
}
