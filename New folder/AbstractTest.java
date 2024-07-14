public abstract class AbstractTest {
    private String myName;
    public AbstractTest(String myNameParam) {
        this.myName = myNameParam;
    
    }
    
    public abstract String getMyDetails();
    public String getMyName() {
        return this.myName ;
    };
}
