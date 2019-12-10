package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;

public class Rectangle extends PlaneShape {

    private Vertex a;
    private double width;
    private double high;

    public Rectangle(Vertex a, double width, double high) {
        this.a = a;
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public double getPerimeter() {
        return (width + high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + a.toString() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}