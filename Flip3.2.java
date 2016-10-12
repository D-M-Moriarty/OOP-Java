import java.util.*;

public class flip3.2 {
	public static void main(String args[]){
		
		
		//int nums[] = {2,6,4,1,9,7,-31,54,5};
		int nums[] = {1, 2, 5, 4, 3, 10, 9, 8, 7};
		//int numsCopy[] = new int[nums.length];
		//int nums[] = {4,1,6,2,9};
		int j = 0, smallest=0, smallestTemp, tempPos,largest=0,largestTemp,lastPos,lastNum,pos=0;
		int flipPos=0;
		String flips="";
		int a = 0;
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++){
			
			largest = a; //setting the first element to the largest
			
			for(j = 0; j < nums.length-i; j++){ // nums.length-i; should take the last element off the end of the array each itteration
				if (nums[j] > nums[largest]){
					largest = j; //finding the largest element in the array
					
					flipPos = j+1; //counting flips
					
				}
			}
			
			flips += (flipPos+" ");
			
			int numsCopy[] = new int[largest+1]; // creating an array the length of the largest position
			
			for(int k = numsCopy.length-1; k >= 0; k--){
					numsCopy[k] = nums[largest-k]; // starting at the position of largest running backwards
					
				}
			
		/*	if(largest != a){ // checking is the first element the largest
				largestTemp = nums[a];
				nums[a] = nums[largest];
				nums[largest] = largestTemp; //swapping
			}*/

			
			int numsCopy2[] = new int[numsCopy.length]; //making a copy 
			
			/*for(int k = numsCopy.length-1; k >= 0; k--){
					numsCopy2[k] = nums[largest-k];
				}*/
				
			for(int k = 0; k < numsCopy.length; k++){
					numsCopy2[k] = numsCopy[numsCopy.length-1-k];
				}
				
			int numsRev[] = new int[nums.length];
				int f = 0;
			for(int k = nums.length-1; k >= 0; k--){
					
					numsRev[k] += numsCopy2[f]; //minus i	
					f++;
				}
				
			for(int k = 0; k < nums.length-i; k++){
				nums[k] = numsRev[k+i]; 
				}
			
			System.out.print("NumsCopy "+Arrays.toString(numsCopy));
			System.out.print("Numscopy 2 "+Arrays.toString(numsCopy2));
			System.out.print("NumsRev "+Arrays.toString(numsRev));
			//System.out.print(Arrays.toString(nums)+" nums  flip "+(i+1));
			System.out.println();
			System.out.println();
			
		}
		
		System.out.println("\nK-Flips = "+flips);
		
	}
}