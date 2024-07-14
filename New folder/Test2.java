public class Test2 extends TestClass  {
    private String idNumber;
   public Test2(String name, int age, String idNumber) {
        super(name, age);
        this.idNumber = idNumber;

    }
    public String getIdNumber() {
        
        return this.idNumber;
    }

    // public String getDetails() {
    //     String st = "\n";
    //     st += this.toString();

    //     st += "\nID Number: "+ this.idNumber ;

    //     return st;
    // }
   public static void main(String[] args) {
    Test2 test1 = new Test2("Bright", 10, "ID00012");
    // System.out.println(test1.getDetails());
    System.out.println(test1.toString());
   }



}
