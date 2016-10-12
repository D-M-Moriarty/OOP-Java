import java.util.*;

public class Flipping2 {
	public static void main(String args[]){
		
		
		//int nums[] = {2,6,4,1,9,7,-31,54,5};
		int nums[] = {4,1,6,2,9};
		//int numsCopy[] = new int[nums.length];
		int j = 0, smallest=0, smallestTemp, tempPos,largest=0,largestTemp,lastPos,lastNum,pos=0;
		int flipPos=0;
		String flips="";
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++){
			largest = i;
			for(j = (i+1); j < nums.length; j++){
				if (nums[j] > nums[largest]){
					largest = j;
					
					flipPos = j+1;
					
				}
			}
			
			flips += (flipPos+" ");
			
			int numsCopy[] = new int[largest];
			
			for(int k = numsCopy.length-1; k >= 0; k--){
					numsCopy[k] = nums[largest-k];
					
				}
				
			
			
			if(largest != i){
				largestTemp = nums[i];
				nums[i] = nums[largest];
				nums[largest] = largestTemp;
				
				
			}
			
			/*System.out.println(Arrays.toString(nums)+" "+(nums[i])+" and "+(nums[j-1])+" were switched ");
			System.out.println();
			System.out.println(" Reversing the array "+Arrays.toString(numsCopy));
			System.out.println();*/
			
			System.out.print(Arrays.toString(nums));
			System.out.print(Arrays.toString(numsCopy));
			System.out.println();
			
		}
		
		System.out.println(flips);
		
	}
}