import java.util.Scanner;

public class Lecture3_2 {
    
    public static double getPerimeter(double radius) {
        double pi = Math.PI;
        double perim = 2 * pi * radius;
        
        return perim;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Radius: ");
        double radiusNum = input.nextDouble();
        double per = getPerimeter(radiusNum);
        System.out.println(per + "\n");

        // get perimetwer for radius:20;
        double perim = getPerimeter(20);
        System.out.println(perim);

        input.close();
    }
}
