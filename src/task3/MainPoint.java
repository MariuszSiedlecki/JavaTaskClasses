package task3;

import javax.sound.midi.Soundbank;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,4);
        Point2D anotherPoint = new Point2D(6,1);

        System.out.println(point2D.getDistance(anotherPoint));

    }
}
