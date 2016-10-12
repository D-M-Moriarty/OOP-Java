import java.util.Scanner;

public class reverse {
    public static int reverse(int x) {
    	
        String rev = Integer.toString(x);
        String rev1="";
        
        
        for(int i = rev.length()-1; i >=0; i--)
        {
            rev1 += rev.charAt(i);
        }
        
        return Integer.parseInt(rev1);
    }
    
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
        
        System.out.print("Enter");
        int x = input.nextInt();
        
    	
        System.out.print(reverse(x));
    }
}