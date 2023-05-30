package factory;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape rec = new Rectangle();


        ShapeFactory.getShape(ShapeType.CIRCLE).draw();
        ShapeFactory.getShape(ShapeType.RECTANGLE).draw();

        Rectangle rectangle = new Rectangle();

        ShapeType.CIRCLE.draw();
        ShapeType.RECTANGLE.draw();

    }
}
