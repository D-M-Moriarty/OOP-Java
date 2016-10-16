/**
 *Boat.java
 *@author Darren Moriarty
 */
 
public class Boat {
	private String owner;
	private double value;
	private boolean sailBoat;
	private static int numBoats;
	
	public Boat(){
		this("Unknown owner",0,false);
	}
	
	public Boat(String owner, double value, boolean sailBoat){
		setOwner(owner);
		setValue(value);
		setSailBoat(sailBoat);
		numBoats++;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public void setValue(double value){
		this.value = value;
	}
	
	public void setSailBoat(boolean sailBoat){
		this.sailBoat = sailBoat;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public double getValue(){
		return value;
	}
	
	public boolean isSailBoat(){
		return this.sailBoat;
	}
	
	public static int getNumBoats(){
		return numBoats;
	}
	
	public String toString(){
		return "The owner is " + getOwner() + 
			"\nThe value is " + getValue() + 
			"\nIt is " + isSailBoat() +" that it is a Sail Boat\n" +
			"The num of boats is " + getNumBoats();
	}
	
}