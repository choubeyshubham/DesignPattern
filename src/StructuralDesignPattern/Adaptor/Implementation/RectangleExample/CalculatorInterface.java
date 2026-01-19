package StructuralDesignPattern.Adaptor.Implementation.RectangleExample;

import org.w3c.dom.css.Rect;

public interface CalculatorInterface {
    // target interface
    public double getArea(Rectangle r);
}

class Calculator implements CalculatorInterface
{
    Rectangle rectangle;

    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}