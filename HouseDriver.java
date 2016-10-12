import java.util.Scanner;

public class HouseDriver {
	public static void main(String[] args){
		 
		House h1 = new House("cork","bungalo",4500,new Person("Darren","M","Moriarty"));
		
		House h2 = new House("cork","bungalo",-4500,new Person("Darren","M","Moriarty"));
		
		House h3 = new House();
		
		System.out.println("Will first try to create a House object via the no-argument copy constructor...");
		
		System.out.println("The values of the House object h1 at this stage are as follows:");
		System.out.println(h1.toString());
		
		System.out.println("Will now try to create a second house object. this time via arguments passed to the constructor with invalid price...");
		
		System.out.println("The values of the House object h2 at this stage with invalid price are as follows:");
		System.out.println(h2.toString());
		
		System.out.println("The values of the House object h3 at this stage with valid price are as follows:");
		System.out.println(h3.toString());
		
		double mass = 10;
		double energy = mass*(PhysicsStuff.C*PhysicsStuff.C);
		
		System.out.println("\n"+energy);
		
		
		
	}
}