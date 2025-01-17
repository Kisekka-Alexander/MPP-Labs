package lab3.prob3A;

public class Circle extends Cylinder{

private double radius;

public Circle(double radius){
    super(0.0, radius);
    this.radius = radius;
}

public double getRadius(){
    return radius;
}

public double computeArea(){
    return Math.PI*radius*radius;
}
}
