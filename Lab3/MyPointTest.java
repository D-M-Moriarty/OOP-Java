import java.util.Scanner;

public class MyPointTest {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		
		MyPoint point1 = new MyPoint();
		
		MyPoint point2 = new MyPoint(5,5);
		
		
		System.out.print(point1.toString());
		System.out.println();
		System.out.println(point2.toString());
		
		point2.translate(5,5);
		
		System.out.println("Point2 after translation " + ((point2.getXVal() + point2.getYVal())/2));
		
		System.out.print("The distance between the two points is " + MyPoint.distanceFromOrigin(point1,point2));
		
	}
}