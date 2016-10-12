import java.text.*;
import java.util.*;
public class House {
	private String address;
	private String type;
	private double price;
	private Person owner;
	
	
	public House(){
		setAddress("No Address Specified");
		setType("No Type Specified");
		setPrice(0);
		setOwner(new Person("No Owner Specified","",""));
	}
	
	public House(String address, String type, double price, Person owner){
		setAddress(address);
		setType(type);
		setOwner(owner);
		setPrice(price);
		
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setPrice(double price){
		if(price >= 0)
			this.price = price;
	}
	public void setOwner(Person owner){
		this.owner = owner;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getType(){
		return this.type;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public Person getOwner(){
		return this.owner;
	}
	
	public String toString(){
		/*Currency currencyInstance = Currency.getInstance(enUSLocale);
		System.out.println(
    "Symbol for US Dollar, en-US locale: " +
    currencyInstance.getSymbol(enUSLocale));*/
		return String.format("Address: %s\nType: %s\nPrice: %.2f\nOwner: %s",getAddress(),getType(),getPrice(),getOwner());
	}
	
}

