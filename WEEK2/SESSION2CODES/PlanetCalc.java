public class PlanetCalc {
    public static void main(String[] args) {
        
        float d_e_p = 5.0578F * 100000000;
        int c = 299792458/1000;
        final double time = d_e_p/c/3600;

        System.out.printf("\n%.3f\t%.0f\n\n", time, time);
        System.out.println(time);

        // int num = 5 * 5;

        // System.out.println(num);


    }
}
