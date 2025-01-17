package lab3.prob3B;

public class Cylinder {

    private double height;
    private Circle circle;

    public Cylinder(double height, double radius){
        this.height = height;
        circle = new Circle(radius);
    }
    public double getHeight() {
        return height;
    }

    public double computeVolume(){
        return circle.computeArea() * height;
    }
}
