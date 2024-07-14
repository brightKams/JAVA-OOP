import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayLists {

       
    public static void main(String[] args) {
        // CREATING ARRAYS
        String[] friendsArray = new String[4];
        // friendsArray = new String[]{"John", "Chris", "Eric", "Luke"};
        // Using the index of the empty Array to insert variables into the already initialized and size allocated Array.
        friendsArray[0] = "John"; friendsArray[1] = "Chris"; friendsArray[2] = "Eric"; friendsArray[3] = "Luke";
        // To print the contents of an Array, you loop/iterate with the for loop
        // System.out.println("\n\n" + friendsArray);
        for(String each: friendsArray) {
            System.out.print(each + " ");

        }

        // Declaring Array Literal - When size of array and its variables are known.
        String[] friendsArray2 = { "John", "Chris", "Eric", "Luke"};
        System.out.println(friendsArray2.length);
        System.out.println(friendsArray2[1] + "\n");
        
        // CREATING ARRAYLISTS
        // NB: ArrayLists can only hold objects, but Arrays can hold any datatype. To use a primitive in ArrayList<>, you use the Object complementary primitive dataype.
        // 1. DECLARING AN EMPTY ARRAYLIST
        ArrayList<String> friendsArrayList = new ArrayList<>();
        
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        
        System.out.println(friendsArrayList.size());
        System.out.println(friendsArrayList2.get(1));
        // Inserting an item into the ArrayList
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2);
        
        // Iterating through an ArrayList using the index number
        for(int i = 0; i <friendsArrayList2.size(); i++){
            System.out.print(friendsArrayList2.get(i) + " ");
        }
        System.out.println();
        // OR
        // int count = 0;
        // for(String eachItem : friendsArrayList2) {
        //     System.out.print(friendsArrayList2.get(count) + ", ");
        //     count++;
        // }
        // Looping through the items specifically.

        for(String eachItem : friendsArrayList2) {
            System.out.print(eachItem + ", ");
            
        }

        // UPDATING AN ARRAYLIST

        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));

        // REMOVING AN ELEMENT IN AN ARRAYLIST USING the ".remove()" method with the index number or value as parameter.

        // friendsArrayList2.remove(2);
        // OR
        friendsArrayList2.remove("Eric");
        System.out.println(friendsArrayList2);
        
        
        

    }
}