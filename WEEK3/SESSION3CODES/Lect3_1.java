public class Lect3_1 {
    
    
    
    public static int getRandom(int minimum, int maximum) {
        int range = maximum - minimum;
        double rand = minimum +  Math.random() * range;  
        int intRand = (int)rand;
        System.out.println(" " + getRandom(3,7));
        return intRand;
        
    }
    


    public static void main(String[] args) {
        
        int minimum = 3;
        int maximum = 7;
        int range = maximum - minimum;

        double rand = minimum +  Math.random() * range;
        System.out.println(" random = " + rand + "\n");

        int intRand = (int)rand;
        System.out.println(" random = " + intRand + "\n");





    }
}
