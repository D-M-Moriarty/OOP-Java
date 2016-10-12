/*this program caluculates the colume of a cube
 *it then tells you whether you can carry it on a flight*/
 
 import java.util.Scanner;
 
 public class CubicContainer {
 	public static void main(String[] args){
 		
 		Scanner in = new Scanner(System.in);
 		
 		System.out.print("Please enter the length of the side of the container: ");
 		int length = in.nextInt();
 		
 		int container = MyMethods.cube(length);
 		
 		if(container > 100){
 			System.out.print("\nYou can't take this on board, put it into your check-in luggage");
 		}else{
 			System.out.print("\nyou can take it on board");
 		}
 		
 	}
 }