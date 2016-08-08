
public class Employee extends Person{

	
	public Employee(String fName, String lName,String title) {
		super(fName, lName);
		setTitle(title);
	}

	private String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	} 
	@Override //telling compiler we are overriding the method
	public void printName() {
		System.out.println(getlName() + ", " + getfName() + ": " + Title);
	}
	
	
}
