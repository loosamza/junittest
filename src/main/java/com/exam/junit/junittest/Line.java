package com.exam.junit.junittest;

public class Line {

	private final double x0, y0, x1, y1;

	public Line(double x0, double y0, double x1, double y1) {
		
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}

	public double calSlope() {
		if (x1 == x0) {
			throw new ArithmeticException();
		}
		return (y1 - y0) / (x1 - x0);
	}

	public double calDistance() {
		return Math.sqrt(Math.pow(x1 - x0, 2.0) + Math.pow(y1 - y0, 2.0));
	}

	public boolean isParalleTo(Line l) {
		return Math.abs(calSlope() - l.calSlope()) < 0.00001;
	}

	public double getX0() {
		return x0;
	}

	public double getY0() {
		return y0;
	}

	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}
	
	

}
