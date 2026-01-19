package StructuralDesignPattern.Adaptor.Implementation.RectangleExample;

class Rectangle {
    public double length;
    public double width;
}

class Triangle {
    public double base;
    public double height;

    public Triangle(double b, double h)
    {
        base = b;
        height = h;
    }
}
