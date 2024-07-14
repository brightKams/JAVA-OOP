public class TestClass {
    private String name;
    private int age;
    
    public TestClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String st  = "\n";
        st += "Name: " + this.name + "\nAge: " + this.age;
        System.out.println(st);
        return st;
    }
}