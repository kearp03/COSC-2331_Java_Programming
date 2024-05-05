package lab8.exe1;
import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicPay, allowance, incomeTax, netSalary;
	private static final Scanner scan = new Scanner(System.in);
	
	/* user input: id, name, and basic pay
	 * methods: calculate allowance, income tax, and net salary
	 */
	
	/* Constructor: takes in array of Employee objects
	 */
	Employee(Employee[] eArr) {
		//reads first id, name, and basic pay
		this.readInfo(eArr);
		//calls methods to calculate the remaining three fields
		this.calcAllowance();
		this.calcTax();
		this.calcNet();
	}
	
	//method to read how many Employee objects to create an array for
	public static int howMany() {
		System.out.print("Enter how many employee's you want to enter and calculate the pay slip: ");
		return scan.nextInt();
	}
	
	/* method to read and initialize employeeId, employeeName, and basicPay
	 * validates employeeId to ensure it is unique
	 */
	private void readInfo(Employee[] eArr) {
		//do while loop to read employeeId
		do {
			System.out.print("Unique Employee ID: ");
			this.setEmployeeId(scan.nextInt());
		} while(checkId(eArr));
		//calls validate method to validate id entered
		
		//prevents enter key from last scan from being read as employeeName
		scan.nextLine();
		
		//reads employeeName
		System.out.print("Employee Name: ");
		this.setEmployeeName(scan.nextLine());
		
		//reads basicPay
		System.out.print("Basic Pay: ");
		this.setBasicPay(scan.nextDouble());
	}
	
	/* method to validate employeeId to ensure uniqueness
	 * loops through array given until null value is reached
	 */
	private boolean checkId(Employee[] eArr) {
		for(int i = 0; eArr[i] != null; i++) {
			if(eArr[i].employeeId == employeeId) {
				System.out.println("Duplicate ID; enter again:");
				return true;
			}
		}
		return false;
	}
	
	//method to calculate and set allowance
	private void calcAllowance() {
		this.setAllowance(this.basicPay * 0.5);
	}
	
	//method to calculate and set tax
	private void calcTax() {
		double gross = basicPay + allowance;
		if(gross <= 5000) {
			this.setIncomeTax(0);
		} 
		else if(gross <= 6000) {
			this.setIncomeTax(basicPay * 0.1);
		} 
		else if(gross <= 10000) {
			this.setIncomeTax(basicPay * 0.15);
		} 
		else {
			this.setIncomeTax(basicPay * .2);
		}
	}
	
	//method to calculate and set netSalary
	private void calcNet() {
		this.setNetSalary(basicPay + allowance - incomeTax);
	}
	
	//method to print a series of specific employees based on id number
	public static void printById(Employee[] eArr) {
		//loops until return statement is reached, id == -1
		while(true) {
			//reads id to print
			System.out.print("Enter the employee ID would you like to print (enter -1 to stop): ");
			int id = scan.nextInt();
			
			//ends method when -1 is entered
			if(id == -1) return;
			
			//prepares a boolean flag
			boolean flag = false;
			//for each loop to loop through array
			for(Employee e : eArr) {
				//checks to see if id of current object is equal to entered id
				if(e.employeeId == id) {
					//prints object, sets flag to false, breaks out of loop
					System.out.println(e);
					flag = true;
					break;
				}
			}
			//if flag was not changed to false, prints error message
			if(!flag) System.out.println("ERROR: ID not recognized");
			System.out.println();
		}
	}
	
	//method to sort Employee array by name
	public static void sortEmployees(Employee[] eArr, String typevalue) {
		for(int i = 0; i < eArr.length-1; i++) {
			for(int j = i+1; j < eArr.length; j++) {
				if(eArr[i].employeeName.compareTo(eArr[j].employeeName) > 0) {
					Employee temp = eArr[i];
					eArr[i] = eArr[j];
					eArr[j] = temp;
				}
			}
		}
		
		System.out.printf("%n%-30s%-30s%-30s%-30s%-30s%-30s%n", "employeeName", "employeeId", "basicPay", "allowance", "incomeTax", "netSalary");
		for(Employee e : eArr) {
			System.out.printf("%-30s%-30d%-30.2f%-30.2f%-30.2f%-30.2f%n", e.employeeName, e.employeeId, e.basicPay, e.allowance, e.incomeTax, e.netSalary);
		}
	}
	
	//generated toString method
	@Override
	public String toString() {
		return employeeName + "\t[employeeId=" + employeeId + ", basicPay=" + basicPay + ", allowance=" 
				+ allowance + ", incomeTax=" + incomeTax + ", netSalary=" + netSalary + "]";
	}

	//generated getters and setter methods
	public int getEmployeeId() {return employeeId;}

	public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}

	public String getEmployeeName() {return employeeName;}

	public void setEmployeeName(String employeeName) {this.employeeName = employeeName;}

	public double getBasicPay() {return basicPay;}

	public void setBasicPay(double basicPay) {this.basicPay = basicPay;}

	public double getAllowance() {return allowance;}

	public void setAllowance(double allowance) {this.allowance = allowance;}

	public double getIncomeTax() {return incomeTax;}

	public void setIncomeTax(double incomeTax) {this.incomeTax = incomeTax;}

	public double getNetSalary() {return netSalary;}

	public void setNetSalary(double netSalary) {this.netSalary = netSalary;}
}