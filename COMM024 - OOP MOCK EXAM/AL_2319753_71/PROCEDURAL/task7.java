package PROCEDURAL;
public class task7 {
    

    public static void main(String[] args) {
        final double radius = 4;
        double pi, area;
        pi = Math.PI;
        // area = Math.pow((2 * (pi)), radius);
        //  area = 2⫪r⒉ 
        area = ((2 * pi) * (Math.pow(radius, 2)));

   
        System.out.printf("Area = %.2f", area);
    }
}
