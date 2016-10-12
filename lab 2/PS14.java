import java.util.Scanner;

public class PS14{
	public static void main(String[] args){
		
		String name;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		name = in.nextLine();
		
		System.out.print("The number of characters in your name is "+
			name.length()+"\nYour first initial is "+name.charAt(0)+
			"\nYour name in all capitals is "+name.toUpperCase()+
			"\nYour surname is "+name.substring(name.lastIndexOf(" ")));
		
		
		
	}
}