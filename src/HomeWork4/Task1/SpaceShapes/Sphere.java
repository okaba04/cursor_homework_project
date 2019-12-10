package HomeWork4.Task1.SpaceShapes;

import HomeWork4.Task1.Vertex;

public class Sphere extends SpaceShape {

    private Vertex a;
    private double radius;

    public Sphere(Vertex a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + a +
                ", radius = " + radius +
                ", volume = " + getVolume() +
                ", area = " + getArea();
    }
}
