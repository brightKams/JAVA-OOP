public class PrintOut {


    public static void main(String[] args) {
        String name = "Bright";
        String surName = "Ohakam";
        // System.out.println(name );
        // System.out.print(" " + surName);
        // System.out.println();
        System.out.println("My First name is " + name + "\nMy Last name is: " + surName );
        
        int age = 10;
        System.out.println(); //printing an empty line.
        float floatNum = 2.3533333f;
        System.out.printf("My First name is %s \nMy Last name is: %s \nMy age is %d\n", name, surName, age);
        //formating specifiers in java: %s (String character), %d(integer), %f(float or double data value);
        System.out.println(floatNum);
        System.out.printf("%.2f", floatNum); //Printing out the float to 2 decimal places



    }
}
