package HomeWork4.Task1.SpaceShapes;

import HomeWork4.Task1.Vertex;

public class Cuboid extends SpaceShape {
    private Vertex a;
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex a, double width, double height, double depth) {
        this.a = a;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * ((depth * width) + (width * height) + (height * depth));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " + a +
                ", width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                ", volume = " + getVolume() +
                ", area = " + getArea();
    }
}