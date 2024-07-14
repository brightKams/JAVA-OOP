public class TestClass {
    String name, regNo;

    


    public TestClass(String name, String regNo){

        this.name = name;
        this.regNo = regNo;
    }


    public String toString() {
        String st = "";
        st += "My name is :" + this.name;
        System.out.println(st);
        return st;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    


    public static void main(String[] args) {
        
    }
}
