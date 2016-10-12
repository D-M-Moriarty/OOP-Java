//Person class

public class Person
{
	private String fName;
	private String lName;
	private String mName;
	
	public Person(){
		setName("","","");
	}
	
	public Person(String firstName, String middleName, String lastName){
		setName(firstName, middleName, lastName);
	}
	
	public String toString(){
		return fName + " " + mName + " " + lName;
	}
	
	public void setName(String fName,String mName, String lName){
		setFirstName(fName);
		setMiddleName(mName);
		setLastName(lName);
	}
	
	public void setFirstName(String firstName){
		fName = firstName;
	}
	
	public void setMiddleName(String middleName){
		mName = middleName;
	}
	
	public void setLastName(String lastName){
		lName = lastName;
			
	}
	
	public boolean equals(Person otherPerson){
		return (fName == otherPerson.fName && mName == otherPerson.mName && lName == otherPerson.lName);
	}
	
	public void makeCopy(Person otherPerson){
		fName = otherPerson.fName;
		mName = otherPerson.mName;
		lName = otherPerson.lName;
	}
	
	public String getFirstName(){
		return fName;
	}
	
	public String getMiddleName(){
		return mName;
	}
	
	public String getLastName(){
		return lName;
	}
}