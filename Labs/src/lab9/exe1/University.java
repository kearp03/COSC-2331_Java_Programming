package lab9.exe1;

public class University {
	//private instance variables
	private String Uname, Uaddress, Ucode;
	
	//no param constructor
	University() {}

	//param constructor
	University(String Uname, String Uaddress, String Ucode) {
		this.Uname = Uname;
		this.Uaddress = Uaddress;
		this.Ucode = Ucode;
	}

	//generated getter and setter methods
	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getUaddress() {
		return Uaddress;
	}

	public void setUaddress(String uaddress) {
		Uaddress = uaddress;
	}

	public String getUcode() {
		return Ucode;
	}

	public void setUcode(String ucode) {
		Ucode = ucode;
	}
}