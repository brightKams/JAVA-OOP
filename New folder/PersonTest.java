public class PersonTest extends AbstractTest{
    private int age ;
    public PersonTest(String myName, int age) {
        super(myName);
        this.age = age;
    }

    public String getMyDetails() {
        String st = getMyName() + "\nAge: " + this.age;
        return st;
    }

    public static void main(String[] args) {
        PersonTest person1 = new PersonTest("Bright", 20);
        System.out.println(person1.getMyDetails());
    }

}
