package lab9.exe2;

public class Student extends University {
	private String sName;
	private String Dept;
	private String studID;
	private String Degree;
	private String Major;
	private String Minor;
	private double course1Score;
	private double course2Score;
	private double course3Score;
	
	/*course score should be within 0 - 100.*/
	
	
	
	public Student() {
		super("Tarleton State University","Steohenville, TX","TSU");
		 java.util.Random d = new java.util.Random();
		 String name[ ]= {
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
			this.setsName(name[d.nextInt(name.length)]);
			String dept[]= {
						"cse",
						"ME",
						"CE",
						"IT",
						"Math",
						"Digital Media"
				};
			this.setDept(dept[d.nextInt(dept.length)]);
			this.setStudID(Integer.toString(d.nextInt(1000)));
			String degree[] = {
						"BE",
						"Master",
						"PhD"
				};
			this.setDegree(degree[d.nextInt(degree.length)]);
			this.setMajor(dept[d.nextInt(dept.length)]);
			this.setMinor(dept[d.nextInt(dept.length)]);
			this.setCourse1Score(d.nextInt(101));
			this.setCourse2Score(d.nextInt(101));
			this.setCourse3Score(d.nextInt(101));
		
	}
	
	public Student(String sName, String dept, String studID, String degree, String major, String minor,
			double course1Score, double course2Score, double course3Score, String Uname, String Uaddress, String Ucode) {
		super(Uname, Uaddress, Ucode);
		
		this.sName = sName;
		Dept = dept;
		this.studID = studID;
		Degree = degree;
		Major = major;
		Minor = minor;
		this.setCourse1Score(course1Score);
		this.setCourse2Score(course2Score);
		this.setCourse3Score(course3Score);
	}
	
	
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getStudID() {
		return studID;
	}

	public void setStudID(String studID) {
		this.studID = studID;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public String getMinor() {
		return Minor;
	}

	public void setMinor(String minor) {
		Minor = minor;
	}

	public double getCourse1Score() {
		return course1Score;
	}

	public void setCourse1Score(double course1Score) {
		if(course1Score <= 100 && course1Score >= 0)
			this.course1Score = course1Score;
		else
			this.course1Score = 0;
	}

	public double getCourse2Score() {
		return course2Score;
	}

	public void setCourse2Score(double course2Score) {
		if(course2Score <= 100 && course2Score >= 0)
			this.course2Score = course2Score;
		else
			this.course2Score = 0;
	}

	public double getCourse3Score() {
		return course3Score;
	}

	public void setCourse3Score(double course3Score) {
		if(course3Score <= 100 && course3Score >= 0)
			this.course3Score = course3Score;
		else
			this.course3Score = 0;
	}

	/*: Calculates invoking object's best (top) two-course score average and returns it.*/
	double avgBestTwoCourseGrade() {
		double sum = 0.0;
		if(this.course1Score<this.course2Score && this.course1Score<this.course3Score) {
			sum = this.getCourse2Score()+this.getCourse3Score();
		}
		
		else if(this.getCourse2Score()<this.getCourse1Score()&&this.course2Score<this.course3Score) {
			sum = this.course1Score+this.course3Score;
		}
		
		else if(this.course3Score<this.course1Score&&this.course3Score<this.course2Score) {
			sum = this.course1Score+this.course2Score;
		}
		
		else {
			sum = this.course1Score+this.course2Score+this.course3Score;
			return sum/3;
		}
		
		return sum/2;
	}
	/*: checks invoking object best (top) two-course average with the 
	 * another object's best (top) two-course average and returns true 
	 * if invoking object's best two-course score average is greater 
	 * otherwise, returns false.*/
	boolean sortAvgBestTwoCourseGrade(Student s) {
		return this.avgBestTwoCourseGrade()>s.avgBestTwoCourseGrade();
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", Dept=" + Dept + ", studID=" + studID + ", Degree=" + Degree + ", Major="
				+ Major + ", Minor=" + Minor + ", course1Score=" + course1Score + ", course2Score=" + course2Score
				+ ", course3Score=" + course3Score + ", getUname()=" + getUname() + ", getUaddress()=" + getUaddress()
				+ ", getUcode()=" + getUcode() + "]";
	}	
}