package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;


public class Circle extends PlaneShape {

    private Vertex a;
    private double radius;

    public Circle(Vertex a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle: " + a.toString() +
                ", radius = " + radius +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }

}
