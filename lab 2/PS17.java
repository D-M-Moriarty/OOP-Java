//this program reads in integers and tells you if theyre even or not

import java.util.Scanner;

public class PS17{
	public static void main(String[] args){
		
		int num = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(num != -1){
			
			System.out.print("Please enter an integer: ");
			num = in.nextInt();
			
			if(isEven(num)){
				System.out.print(num+" is even\n");
			}else{
				System.out.print(num+" is odd\n");
			}
			
		}
		
	}
	
	public static boolean isEven(int a){
		return a%2==0;
	}
}