public class Rectangle extends Shape2D{
    private  double width;
    private double length;
    public Rectangle(Color color, int xPos, int yPos, double width, double length){
        super(color, xPos, yPos);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    @Override
    public double getPerimeter() {
       //P= 2 * π * r
       return (2 * this.width) + (2 * this.length);
    }
    @Override
    public double getArea() {
       //A = π * r ^ 2
       return width * length;
    } 
}
