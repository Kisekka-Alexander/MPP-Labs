package lab7.labs.prob2;

public class Ellipse implements ClosedCurve{
    final private double a;
    final private double E;

    public Ellipse(double a, double e) {
        this.a = a;
        E = e;
    }

    @Override
    public double computePerimeter() {
        return 4*a*E;
    }
}
