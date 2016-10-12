import java.util.Scanner;

public class MessageDriver {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		Message message = new Message("Darren","Mike");
		
		message.append("Hello!");
		
		System.out.print(message);
		
	}
}