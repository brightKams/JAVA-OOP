// import java.util.*;
public class ConditionalStatements {
    

    public static void main(String[] args) {
        // getTraffic();
        // Comparison Operators Eg; >, <, <=, >=,!=;
        // "1", 1, 1.0, 1.0f;
        // Relational Operators &&, ||

        String trafficLight = "green";

        if (trafficLight == "red") {
             System.out.println("STOP!!!\n");
        } else if (trafficLight == "yellow") {
         System.out.println("GET READY!!!\n");
        } else if (trafficLight == "green") {
         System.out.println("GO!!!\n");
        } else {
             System.out.println("You entered a wrong color\n");
        }


        

    }
}
