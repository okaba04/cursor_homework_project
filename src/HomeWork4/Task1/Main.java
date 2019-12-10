package HomeWork4.Task1;

import HomeWork4.Task1.PlaneShapes.Circle;
import HomeWork4.Task1.PlaneShapes.Rectangle;
import HomeWork4.Task1.PlaneShapes.Triangle;
import HomeWork4.Task1.SpaceShapes.Cuboid;
import HomeWork4.Task1.SpaceShapes.Sphere;
import HomeWork4.Task1.SpaceShapes.SquarePyramid;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Vertex(1, 2), 2);
        Rectangle rectangle = new Rectangle(new Vertex(1, 2), 10, 2);
        Triangle triangle = new Triangle(new Vertex(1, 2, 5), new Vertex(2, 3), new Vertex(4, 5));
        Cuboid cuboid = new Cuboid(new Vertex(1, 3, 4), 5, 6, 7);
        Sphere sphere = new Sphere(new Vertex(1, 2, 10), 4);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex(4, 6), 5, 10);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(squarePyramid);

        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}