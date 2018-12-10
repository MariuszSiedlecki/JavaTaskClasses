package task3;

public class Point3D extends Point2D{
    private double Z;

    public Point3D(double x, double y,double Z){
        super(x,y);
        this.Z = Z;
    }
    public Point3D(){
        super();
        this.Z = 0;
    }
    public double getZ(){
        return Z;
    }
    public void setZ(double Z){
        this.Z = Z;
    }
}
