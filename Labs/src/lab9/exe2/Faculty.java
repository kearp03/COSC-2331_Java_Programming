package lab9.exe2;

public class Faculty extends University{
	 private String fName;
	 private String Dept;
	 private int SSN;
	 private double Salary;
	 private String AraeOfSpecialization;
	 private int empId;
	 
	  
	 public Faculty() {
		 super("Tarleton State University","Stephenville, TX","TSU");
		 java.util.Random d = new java.util.Random();
		
		 String name[]= {
				"Tom Hanks",
				"Tom Cruise", 
				"Jackie Chan",
				"William Edward",
				"Jack Jill",
				"Jimmy John",
				"Ravi Ram",
				"Virat Kholi",
				"Sachin Tendulkar"
				};
		this.setfName(name[d.nextInt(name.length)]);
		String dept[]= {
					"cse",
					"ME",
					"CE",
					"IT",
					"Math",
					"Digital Media"
			};
		this.setDept(dept[d.nextInt(dept.length)]);
		this.setSSN(d.nextInt(100));
		this.setSalary(d.nextInt(10000000)/100.0);
		String special[]= {
					"Machine Learning",
					"Software Engineering",
					"Human Computer Interaction",
					"Image Processing",
					"Natural Language Processing",
					"Computer Networks",
					"Sensors",
					"Robotics"
			};
		this.setAraeOfSpecialization(special[d.nextInt(special.length)]);
		this.setEmpId(d.nextInt(1000));
		
	}

	public Faculty(String fName, String dept, int sSN, double salary, String araeOfSpecialization, int empId, String Uname, String Uaddress, String Ucode) {
		super(Uname, Uaddress, Ucode);
		this.fName = fName;
		Dept = dept;
		SSN = sSN;
		Salary = salary;
		AraeOfSpecialization = araeOfSpecialization;
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getAraeOfSpecialization() {
		return AraeOfSpecialization;
	}

	public void setAraeOfSpecialization(String araeOfSpecialization) {
		AraeOfSpecialization = araeOfSpecialization;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/*: To sort all the faculty based on empId*/
	 static void sortempId(Faculty e[]) {
		 for(int i=0;i<e.length;i++) {
			 for(int j=0;j<e.length;j++) {
				if( e[i].getEmpId()<e[j].getEmpId()) {
					Faculty temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			 }
		 }
	 }

	@Override
	public String toString() {
		return "Faculty [fName=" + fName + ", Dept=" + Dept + ", SSN=" + SSN + ", Salary=" + Salary
				+ ", AraeOfSpecialization=" + AraeOfSpecialization + ", empId=" + empId + ", getUname()=" + getUname()
				+ ", getUaddress()=" + getUaddress() + ", getUcode()=" + getUcode() + "]";
	}
}