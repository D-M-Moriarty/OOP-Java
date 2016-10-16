import java.util.Scanner;
import java.util.Arrays;

public class EquilibriumIndex{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		
		
		/*System.out.print("please enter the number of indices you want in the array ");
		int numOfIndices = in.nextInt();
		
		int indices[] = new int[numOfIndices];
		
		for(int i = 0; i < indices.length; i++)
			indices[i] = (int)(Math.random() * 10)+1;
			
		System.out.print(Arrays.toString(indices));*/
	
	
	//	int indices[] = {6,2,5,1};
		//int indices[] = {-7, 1, 5, 2, -4, 3, 0};
		//int indices[] = {-11,1,3,-7};
		int indices[] = {0,-1,0,1};
		
		int sum = 0, leftSum = 0;
		
		for(int i = 0; i < indices.length; i++)
			sum += indices[i];
		
		for(int i = 0; i < indices.length; i++){
			sum -= indices[i];
			
			if(sum == leftSum)
				System.out.println(" index is " + i + " and the sum is " + sum);
			
			leftSum +=indices[i];
		}
	
	}
	
	
}