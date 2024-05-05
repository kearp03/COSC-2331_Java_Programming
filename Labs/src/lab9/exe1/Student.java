package lab9.exe1;

//Student class is a subclass of University Class
public class Student extends University{
	//private instance variables
	private String sName, Dept, studID, Degree, Major, Minor;
	private double course1Score, course2Score, course3Score;
	
	//no param constructor
	Student() {
		super();
	}
	
	//param constructor
	Student(String sName, String dept, String studID, String degree, String major, String minor, 
			double course1Score, double course2Score, double course3Score, String Uname, String Ucode, String Uaddress) {
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

	//method to return average of the highest two scores
	double avgBestTwoCourseGrade() {
		if(course1Score < course2Score && course1Score < course3Score) {
			return (this.course2Score + this.course3Score) / 2.0;
		}
		else if(course2Score < course1Score && course2Score < course3Score) {
			return (this.course1Score + this.course3Score) / 2.0;
		}
		else if(course3Score < course1Score && course3Score < course2Score) {
			return (this.course1Score + this.course2Score) / 2.0;
		}
		else if(course1Score == course2Score && course1Score == course3Score){
			return (this.course1Score + this.course2Score + this.course3Score) / 3.0;
		}
		return 0;
	}
	
	//method to return if invoked object's avg course grade is greater than s's avg course grade
	boolean sortAvgBestTwoCourseGrade(Student s) {
		return this.avgBestTwoCourseGrade() > s.avgBestTwoCourseGrade();
	}

	//toString method
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", Dept=" + Dept + ", studID=" + studID + ", Degree=" + Degree + ", Major="
				+ Major + ", Minor=" + Minor + ", course1Score=" + course1Score + ", course2Score=" + course2Score
				+ ", course3Score=" + course3Score + ", getUname()=" + getUname() + ", getUaddress()=" + getUaddress() 
				+ ", getUcode()=" + getUcode() + "]";
	}

	//generated getter and setter methods
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

	//ensures score is between 0 and 100, sets to 0 if not
	public void setCourse1Score(double course1Score) {
		if(course1Score >= 0 && course1Score <= 100)
			this.course1Score = course1Score;
		else {
			System.out.println("Invalid score: Should be in range 0 - 100");
			this.course1Score = 0;
		}
	}

	public double getCourse2Score() {
		return course2Score;
	}

	//ensures score is between 0 and 100, sets to 0 if not
	public void setCourse2Score(double course2Score) {
		if(course2Score >= 0 && course2Score <= 100) this.course2Score = course2Score;
		else {
			System.out.println("Invalid score: Should be in range 0 - 100");
			this.course2Score = 0;
		}
	}

	public double getCourse3Score() {
		return course3Score;
	}

	//ensures score is between 0 and 100, sets to 0 if not
	public void setCourse3Score(double course3Score) {
		if(course3Score >= 0 && course3Score <= 100) this.course3Score = course3Score;
		else {
			System.out.println("Invalid score: Should be in range 0 - 100");
			this.course3Score = 0;
		}
	}
}