/* user written methods
 *Darren Moriarty*/
 
import java.util.Scanner;

public class PS16{
	public static void main(String[] args){
		
		System.out.println("Number\tCube\n------\t------");
		
		for(int i = 1; i < 16; i++){
			System.out.println(i+"\t\t"+MyMethods.cube(i));
		}
		
	}
	
	
}