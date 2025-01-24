package lab7.labs.prob2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter(){
        double perimter = 0.0;
        for(double sd: getSides()){
            perimter += sd;
        }
        return perimter;
    }
}
