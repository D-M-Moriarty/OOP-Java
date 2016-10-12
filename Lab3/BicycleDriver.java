import java.util.Scanner;

public class BicycleDriver {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name, the value and make of your bicycle: ");
		Bicycle bike1 = new Bicycle("darren",25.54,"specialised");
		
		System.out.println(bike1);
		
		Bicycle bike2 = new Bicycle();
		
		System.out.print("Please enter the name of this bike: ");
		String name = in.nextLine();
		bike2.setOwnersName(name);
		
		System.out.print("Please enter the value of this bike: ");
		double value = in.nextDouble();
		bike2.setValue(value);
		
		in.nextLine();
		System.out.print("Please enter the make of this bike: ");
		String make = in.nextLine();
		bike2.setMake(make);
		
		bike1.setValue(bike1.getValue() + 10);
		System.out.println(bike1.getValue());
		
		System.out.println("Owner ones name is " + bike1.getOwnersName() +
						   "\nOwner twos name is " + bike2.getOwnersName() +
						   "\nOwner ones bike value is " + bike1.getValue() +
						   "\nOwner twos bike value is " + bike2.getValue());
						   
		System.out.printf("\n\nThe value of the two bikes is %.2f",
							(bike1.getValue() + bike2.getValue()));
		
		
		
	}
}