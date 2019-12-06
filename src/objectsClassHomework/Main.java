package objectsClassHomework;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Circle area is " + circle.calculateArea(3));

        for (int i = 0; i < 5; i++) {
            new Counter();
        }
        System.out.println(Counter.getCount());

        Car testCar = new Car(5);
        testCar.start(true);
        testCar.drive();
        testCar.keepSpeed(120);
        testCar.stop();
    }
}