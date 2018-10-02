//everett yang, SBU ID 111756324
public class MyPoint {
	protected double x, y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint point) { //find difference between x, find difference between y, pythagoras
		double xLength = point.getX() - this.getX();
		double yLength = point.getY() - this.getY();
		
		double hypotneuseSquare = (xLength * xLength) + (yLength * yLength);
		return Math.sqrt(hypotneuseSquare);
	}
	
	public double distance(double newX, double newY) { //find difference between x, find difference between y, pythagoras
		double xLength = newX - this.getX();
		double yLength = newY - this.getY();
		
		double hypotneuseSquare = (xLength * xLength) + (yLength * yLength);
		return Math.sqrt(hypotneuseSquare);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		System.out.println(point.distance(point2));
	}

}
