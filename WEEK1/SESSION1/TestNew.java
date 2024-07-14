public class TestNew {



    public static void main(String[] args) {
        // int addCalc = 5 + 6;

        // System.out.println(addCalc);

        int myMethod = calc(15, 20);
        // System.out.println(calc(20, 5));
        System.out.println(myMethod);

    }
    // int num1, num2;
    public static int calc(int num1, int num2) {
        int calculation = num1 + num2;
        return calculation;
    }
}