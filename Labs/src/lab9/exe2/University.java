package lab9.exe2;

public class University {
	private String Uname;
	private String Uaddress;
	private String Ucode;

	University(){
		Uname = null;
		Uaddress = null;
		Ucode = null;
	}

	public University(String uname, String uaddress, String ucode) {

		Uname = uname;
		Uaddress = uaddress;
		Ucode = ucode;
	}

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

	@Override
	public String toString() {
		return "University [Uname=" + Uname + ", Uaddress=" + Uaddress + ", Ucode=" + Ucode + "]";
	}	
}