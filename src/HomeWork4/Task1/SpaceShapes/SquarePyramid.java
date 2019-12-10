package HomeWork4.Task1.SpaceShapes;

import HomeWork4.Task1.Vertex;

public class SquarePyramid extends SpaceShape {

    private Vertex a;
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Vertex a, double baseWidth, double pyramidHeight) {
        this.a = a;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return 2 * baseWidth * (baseWidth / (2 + Math.sqrt(Math.pow(pyramidHeight, 2) + Math.pow(baseWidth / 2, 2))));
    }

    @Override
    public double getVolume() {
        return (Math.pow(baseWidth, 2) * pyramidHeight) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid: " + a +
                ", base width = " + baseWidth +
                ", height = " + pyramidHeight +
                ", volume = " + getVolume() +
                ", area = " + getArea();
    }
}

