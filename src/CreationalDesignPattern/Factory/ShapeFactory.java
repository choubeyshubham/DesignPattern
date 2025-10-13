package CreationalDesignPattern.Factory;

public class ShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape createShape(Shape shape){
        return shape;
    }
}

class CircleShapeFactory extends ShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}
class RectangleShapeFactory extends ShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}
class SquareShapeFactory extends ShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Square();
    }
}
