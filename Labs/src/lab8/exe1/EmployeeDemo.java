package lab8.exe1;

public class EmployeeDemo {
	public static void main(String[] args) {
		//creates class reference
		Employee[] eArr = new Employee[Employee.howMany()];
		
		//loops through array and create a new object for each index
		for(int i = 0; i < eArr.length; i++) {
			eArr[i] = new Employee(eArr);
			System.out.println();
		}
		
		//loops through array and prints each object
		for(Employee e : eArr) {
			System.out.println(e);
		}
		
		//sorts array based on names, and then reprints each object
		Employee.sortEmployees(eArr, "name");
		
		//calls method to print employee information based on id
		Employee.printById(eArr);
	}
}