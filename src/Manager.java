
public class Manager extends Employee {
	private int directReports;

	public Manager(String fName, String lName, String title, int directReports) {
		super(fName, lName, title);
		setDirectReports(directReports);

	}

	public int getDirectReports() {
		return directReports;
	}

	public void setDirectReports(int directReports) {
		this.directReports = directReports;
	}

	@Override
	public void printName() {
		System.out.println(getlName() + ", " + getfName() + ": " + getTitle() + directReports);
	}

}
