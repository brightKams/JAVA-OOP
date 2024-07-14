import java.util.ArrayList;


public class TestPerson {

    public static void main(String[] args) {

        Person student1 = new Person("Ohakam", 15, "Aberdeen");
        Person student2 = new Person("Roger", 20, "Aberdeen");
        Person student3 = new Person("Shahana", 30, "Aberdeen");


        ArrayList<Person> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        // students.remove(student1);
        System.out.println();
        System.out.println("---------------\n");
        // System.out.println(students);

        for (Person student : students) {
            System.out.println("Student Name: " + student.getName());
            // System.out.println(student.toString());
        }

        
        System.out.println("\n\nTotal Items in the ArrayList is: " + students.size());
        // System.out.println(student1.getName());
    }
}
