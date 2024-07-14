public class Lab4_2_1 {
    
    public static int[] createArray(int numberValues, int startValue, int ratio){
        

        int[] values = new int[numberValues];
        int currentValue = startValue;
        int index = 0;
        for(int i = 0; i < numberValues; i++){
            values[index] = currentValue;
            currentValue *= ratio; //currentValue = currentValue * 3
            System.out.println(currentValue + " Hello");
            index ++;
            System.out.println(index + " Index");
            
        }
        
        return values;
    }

    public static void displayArrayValues(int[] values) {

        System.out.println();
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i] + " ");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        // createArray(8, 3, 3);
        int[] values = createArray(8, 3, 3);
        System.out.println();
        displayArrayValues(values);
    }









    // public static void main(String[] args) {
        
    //     final int numberValues = 10;
    //     int[] values = new int[numberValues];
    //     int startValue = 2;
    //     int currentValue = startValue;
    //     int index = 0;
    //     for(int i = 0; i < 4; i++){
    //         values[index] = currentValue;
    //         currentValue *= 3; //currentValue = currentValue * 3
    //         index ++;
            
    //     }
    //     for(int i = 0; i < 4; i++){
    //         System.out.println(values[i]);

    //     }

    // }

}
