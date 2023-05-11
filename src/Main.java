import Shape.Circle;
import Shape.PrintShape;
import Shape.Shape;
import Shape.Rhombus;
import Shape.Trapeze;
import Shape.Triangle;
import Shape.Square;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        new PrintShape(circle);
        System.out.println(circle.getName());

        Shape rhombus = new Rhombus();
        new PrintShape(rhombus);
        System.out.println(rhombus.getName());

        Shape square = new Square();
        new PrintShape(square);
        System.out.println(square.getName());

        Shape trapeze = new Trapeze();
        new PrintShape(trapeze);
        System.out.println(trapeze.getName());

        Shape triangle = new Triangle();
        new PrintShape(triangle);
        System.out.println(triangle.getName());


    }
}