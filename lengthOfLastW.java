import java.util.Scanner;

public class lengthOfLastW {
    public static int lengthOfLastWord(String s) {
        
        int last=0;
        
        for(int i = s.length()-1; i >= 0; i--)
        {
        	if(Character.isWhitespace(s.charAt(i)))
        	{
        		last = s.length()-i;
        		break;
        	}
        }
        
        return last-1;
    }
    
    public static void main(String args[]){
    	
    	Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a word");
       String s = input.nextLine();
    	
    	System.out.print(lengthOfLastWord(s));
    }
}