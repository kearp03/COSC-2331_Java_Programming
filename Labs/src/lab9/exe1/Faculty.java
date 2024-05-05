package lab9.exe1;

//Faculty class is a subclass of University class
public class Faculty extends University{
	//private instance variables
	private String fName, Dept;
	private int SSN;
	private double Salary;
	private String AreaOfSpecialization;
	private int empId;
	
	//no param constructor
	Faculty() {
		super();
	}

	//param constructor
	Faculty(String fName, String Dept, int SSN, double Salary, 
			String AreaOfSpecialization, int empId, String uName, 
			String Ucode, String Uaddress) {
		super(uName, Uaddress, Ucode);
		this.fName = fName;
		this.Dept = Dept;
		this.SSN = SSN;
		this.Salary = Salary;
		this.AreaOfSpecialization = AreaOfSpecialization;
		this.empId = empId;
	}

	//method to sort an array of Faculty objects by empId
	public static void sortempId(Faculty e[]) {
		for(int i = 0; i < e.length - 1; i++) {
			for(int j = i+1; j < e.length; j++) {
				if(e[i].empId > e[j].empId) {
					Faculty temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}
	}
	
	//toString method
	@Override
	public String toString() {
		return "Faculty [fName=" + fName + ", Dept=" + Dept + ", SSN=" + SSN + ", Salary=" + Salary
				+ ", AreaOfSpecialization=" + AreaOfSpecialization + ", empId=" + empId + ", getUname()=" + getUname()
				+ ", getUaddress()=" + getUaddress() + ", getUcode()=" + getUcode() + "]";
	}

	//generated getter and setter methods
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String Dept) {
		this.Dept = Dept;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int SSN) {
		this.SSN = SSN;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public String getAreaOfSpecialization() {
		return AreaOfSpecialization;
	}

	public void setAreaOfSpecialization(String AreaOfSpecialization) {
		this.AreaOfSpecialization = AreaOfSpecialization;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}