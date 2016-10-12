//This program usesann array to populate an array

import java.util.Scanner;

public class PS18{
	public static void main(String[] args){
		
		int[] nums = new int[10];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++){
			System.out.print("Please enter an intger: ");
			nums[i] = in.nextInt();
		}
		
		System.out.print("\n\nThe first value in the array is "+nums[0]+
			"\n\nThe fifth value in the array is "+nums[4]);
		
	}
}