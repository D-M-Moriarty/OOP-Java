public class MyPoint {
	
	private double xVal;
	private double yVal;
	
	public MyPoint(){
		this.xVal = 0;
		this.yVal = 0;
	}
	
	public MyPoint(double xVal, double yVal){
		setXVal(xVal);
		setYVal(yVal);
	}
	
	public void setXVal(double xVal){
		this.xVal = xVal;
	}
	
	public void setYVal(double yVal){
		this.yVal = yVal;
	}
	
	public double getXVal(){
		return xVal;
	}
	
	public double getYVal(){
		return yVal;
	}
	
	public double moveHorizontally(double horizontalValue){
		return xVal += horizontalValue;
	}
	
	public double moveVertically(double verticalValue){
		return yVal += verticalValue;
	}
	
	public void translate(double xDir, double yDir){
		xVal += xDir;
		yVal += yDir;
	}
	
	public static double distanceFromOrigin(MyPoint point1, MyPoint point2){
		return Math.sqrt( Math.pow((point2.getXVal() - point1.getXVal()),2) + Math.pow((point2.getYVal() - point1.getYVal()),2));
	}
	
	public String toString(){
		return "xVal = " + getXVal() +
			   "\nyVal = " + getYVal();
	}
}