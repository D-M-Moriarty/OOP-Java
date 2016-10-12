//using array to sort cattle

import java.util.Scanner;

public class PS19{
	public static void main(String[] args){
		
		double[] cattle = {234.2, 123, 344.8, 344.4, 150.6,523.4,233,958,101,66.23};
		
		int under250=0, over400=0;
		double averageWeight, lightest=0, total=0;
		
		String weights="";
		
		for(int i = 0; i < 10; i++){
			
			weights += cattle[i]+", ";
			
			if(i == 0){
				lightest = cattle[i];
			}else if(cattle[i] < lightest){
				lightest = cattle[i];
			}
			
			total += cattle[i];
			
			if(cattle[i] < 250)
				under250 ++;
				
			if(cattle[i] > 400)
				over400 ++;
			
		}
		
		System.out.print("Weights: "+weights+"\nNumber under 250 kg: "+
			under250+"\nPercentage over 400 Kg: "+(int)((over400*100)/10)+"%"+
			"\nLightest animal: "+lightest+"\nAverage weight: "+total/10+"kg");
		
	}
}