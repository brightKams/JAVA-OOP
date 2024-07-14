public abstract class BasicShape {
    private Color color;

    public BasicShape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return this.color;
    }

    public abstract String getDetails();

    public String toString(){
        return getDetails();
    }
}
