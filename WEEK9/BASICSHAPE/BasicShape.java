public abstract class BasicShape {
    private Color color;
    public BasicShape(Color color) {
        this.color = color;
    }

    public abstract String getDetails();

    public Color getColor() {
        return this.color;

    }

    public String toString() {
        return getDetails();
    }
}
