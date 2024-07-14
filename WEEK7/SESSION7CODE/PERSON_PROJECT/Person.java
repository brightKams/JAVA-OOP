public class Person {

    public String name;
    private int age;
    private String address;

    // This is a constructor Function
    // NB: The major difference between a constructor function and a Class function is that the constructor has parameters while the Class Function has no parameter.
    // Also, Class Functions have the keyword "class" before the function name.
    // However, both of them must start with a capital letter.
    public Person(String n, int a, String add) {
        this.name = n;
        this.age = a;
        this.address = add;

    }

    public String toString() {
        String st = "";
        st += "\nname: " + this.name + "\n";
        st += "age: " + this.age + "\n";
        st += "address: " + this.address + "\n";

        return st;
    }

    public void setName(String newName) {
        this.name = newName;
        
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bright", 5, "Aberdeen");
        // System.out.println(person1.toString());
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        
          person1.setName("Dozie");
        System.out.println(person1.getName());

        // System.out.println(person1.getName());
        // System.out.println("\n" + person1);
        // person1.setName("Ohakam");
        // System.out.println(person1.getName());
        
        
        // getMyName("Bright Ohakam");
    }
}











// public static String getMyName(String myName) {
//              String fullName = myName;
//                 System.out.println(fullName);
//                 return fullName;
// }    

// getName(); 
// 