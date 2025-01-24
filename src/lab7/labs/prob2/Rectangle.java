package lab7.labs.prob2;

public final class Rectangle implements Polygon {
	final private double width;
	final private double length;

	@Override
	public double[] getSides() {
		return new double[] {length, width};
	}

	@Override
	public double computePerimeter() {
		double perimeter =  2 *(width + length);
		return perimeter;
	}
	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
