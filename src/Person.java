
public class Person {

	private String fName;
	private String lName;
	
	public Person (String fName, String lName){
		setfName(fName);
		setlName(lName); 
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void printName() {
		
		System.out.println(lName + ", " +  fName );
	}
	
	
}
