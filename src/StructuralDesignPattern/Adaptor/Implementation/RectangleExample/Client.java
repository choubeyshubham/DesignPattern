package StructuralDesignPattern.Adaptor.Implementation.RectangleExample;

public class Client {

    public static void main (String [] args) {

        System.out.println("***Adapter Pattern Demo***");

        Triangle t = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));
    }
}
