public class Lab3_1 {
    
    public static double getCircleArea(int max, int min){

        // given that Circle are = PIr
        double pi, circleArea, randRadius;
        // System.out.println(max + " " + min + "\n");
        int range = max - min;
        // System.out.println(range + "\n");
        
        randRadius = min + Math.random() * range;
        // System.out.println(randRadius + "\n");
        pi = Math.PI;
        //    double r = radius;
        // circleArea = 2 * pi * randRadius;
        // circleArea = circleArea * circleArea;
        int radiusPower = 2;
        circleArea = ((pi) * (Math.pow(randRadius, radiusPower)));
        System.out.printf("Area for radius %f is %f\n", randRadius, circleArea);
        return circleArea;
        
    }
    
    public static void main(String[] args) {
        
        
        double area = getCircleArea(10, 5);
       
        System.out.printf("circle Area: %.6f\n", area);
        

    
    }

}
