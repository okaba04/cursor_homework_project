package HomeWork4.Task1.PlaneShapes;

import HomeWork4.Task1.Vertex;


public class Triangle extends PlaneShape {

    private Vertex a;
    private Vertex b;
    private Vertex c;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calculateTriangleSide(Vertex a, Vertex b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    @Override
    public double getArea() {
        return (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2;
    }

    @Override
    public double getPerimeter() {
        double sideA = calculateTriangleSide(a, b);
        double sideB = calculateTriangleSide(b, c);
        double sideC = calculateTriangleSide(c, a);
        return sideA + sideB + sideC;
    }


    @Override
    public String toString() {
        return "Triangle: " +
                "A " + a.toString() +
                ", B " + b.toString() +
                ", C " + c.toString() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}

