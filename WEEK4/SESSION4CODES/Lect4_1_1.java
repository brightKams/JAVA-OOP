import java.util.Random;

public class Lect4_1_1 {
    
    public static void main(String[] args) {
        final int totalArrayLength = 5;
        double[] heights;
        heights = new double[totalArrayLength];

        heights[0] = 141;
        heights[1] = 178.67;
        heights[2] = 183.4;
        heights[3] = 145.9;
        heights[4] = 167.2;

        for(int i = 0; i < heights.length; i++ ) {
            System.out.println(heights[i]);
        }
        
        double[] rands = new double[10];
        Random rand = new Random();
        for(int i = 0; i < heights.length; i++ ) {
            rands[i] = rand.nextDouble(); //Math.random()
            // System.out.println(heights[i]);
        }
        
        for(int i = 0; i < heights.length; i++ ) {
            rands[i] = Math.random(); //Math.random()

            System.out.printf("%.3f \n", rands[i]);
        }

    }
}
