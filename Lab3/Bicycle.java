public class Bicycle {
	
	private String ownersName;
	private double value;
	private String make;
	
	public Bicycle(){
		
	}
		
	public Bicycle(String ownersName, double value, String make){
		this.ownersName = ownersName;
		this.value = value;
		this.make = make;
	}
	
	public void setOwnersName(String ownersName){
		this.ownersName = ownersName;
	}
	
	public void setValue(double value){
		this.value = value;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public String getOwnersName(){
		return ownersName;
	}
	
	public double getValue(){
		return value;
	}
	
	public String getMake(){
		return make;
	}
	
	public String toString(){
		return "Owners name is " + ownersName +
				"\nThe value of the bike is " + value +
				"\nThe make is " + make;
	}
	
}