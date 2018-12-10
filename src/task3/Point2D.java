package task3;

public class Point2D {
    private double x;
    private double y;

    Point2D(){
        this.x = 0;
        this.y = 0;
    }
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    private double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    double getDistance(Point2D point2D){
        return Math.sqrt(Math.pow(getX()-point2D.getX(),2)+ Math.pow(getY()-point2D.getY(),2));
    }
}
