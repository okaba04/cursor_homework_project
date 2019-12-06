package objectsClassHomework;

public class Counter {

    private static int count;

    Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}