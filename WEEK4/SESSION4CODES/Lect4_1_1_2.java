import java.util.ArrayList;

public class Lect4_1_1_2 {
    
    public static void main(String[] args){
        
    ArrayList<String> people;
    people = new ArrayList<>();
    

    // Adding a value into the arrayList
    people.add("Jean");
    people.add("John");
    people.add("Catherine");
    people.add("David");
    System.out.println(people);
    
    // Removing a value from the arrayList:
    people.remove("David");
    System.out.println(people);

    }
}
