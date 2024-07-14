public abstract class BasicShape {
    
    private Color color;
    public BasicShape(Color color) {
        this.color = color;
    }

    // ABSTRACT CLASS: This is a class that you can't instantiate. You can't just creat objects directly. 
    public abstract String getDetails();

    public Color getColor() {
        return this.color;

    }

    public String toString() {
        return getDetails();
    }
}
