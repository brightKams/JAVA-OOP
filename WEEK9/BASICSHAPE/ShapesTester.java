import java.util.ArrayList;

public class ShapesTester {

    public static void main(String[] args) {
        BasicShape s1 = new Circle(Color.BLUE, 10, 10, 27.5);
        BasicShape s2 = new Rectangle( Color.BLUE, 20, 20, 20, 50);
        BasicShape s3 = new Sphere(Color.BLUE, 30, 30, 30, 50);

        ArrayList<BasicShape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        for (BasicShape shape : shapes) {
            System.out.println(shape);
        }
    }
}

