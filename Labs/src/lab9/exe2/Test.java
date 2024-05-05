package lab9.exe2;

import java.util.Scanner;

public class Test {
	private static Scanner r  = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Ask the user to enter N and M for the total number of Faculty and students respectively. 
		 * Your program should work for an array of Faculty and Student objects.
		 * Read all information for all Faculty and Student objects.
		 * */
		Faculty faculty [ ] = new Faculty[howMany("How many number of faculty in the university: ")];
		Student student[] = new Student[howMany("How many number of students in the university: ")];
		
		for(int i=0;i<faculty.length;i++) {
			faculty[i] = new Faculty();
					/*new Faculty(readString("Faculty Name: "),readString("Dept: "),
					readInt("SSN: "),readDouble("Salary: "),
					readString("Area of Specialization"),readInt("Emplyee Id: "),
					readString("University name: "),readString("University address: "),
					readString("University code: "));*/
		}
		for(int i=0;i<student.length;i++) {
			student[i] = new Student();
					/*new Student(readString("Student Name :"),readString("Dept: "),
					readString("Id: "),readString("Degree: "),readString("Major: "),
					readString("Minor: "),readDouble("Course 1 score: "),
					readDouble("Course 2 score: "),readDouble("Course 3 score: "),
					readString("University name: "),readString("University address: "),
					readString("University code: ") );*/
		}
		System.out.println("Faculty before sorting based on empId");
		for(int i=0;i<200;i++)
			System.out.print("_");
		//heading
		System.out.printf("\n%-20s%-13s%-5s$%-10s%-30s%-20s%-30s%-20s%-20s\n", 
				"Faculty Name".toUpperCase(),
				"Dept".toUpperCase(),
				"SSN".toUpperCase(),
				"Salary".toUpperCase(),
				"Area of Specialization".toUpperCase(),
				"Emplyee Id".toUpperCase(),
				"University name".toUpperCase(),
				"University address".toUpperCase(),
				"University code".toUpperCase());
		for(int i=0;i<200;i++)
			System.out.print("_");
		for(int i=0;i<faculty.length;i++)
			System.out.printf("\n%-20s%-13s%-5d$%-10.2f%-30s%-20d%-30s%-20s%-20s", 
					faculty[i].getfName().toLowerCase(),
					faculty[i].getDept().toLowerCase(),
					faculty[i].getSSN(),
					faculty[i].getSalary(),
					faculty[i].getAraeOfSpecialization().toLowerCase(),
					faculty[i].getEmpId(),
					faculty[i].getUname().toLowerCase(),
					faculty[i].getUaddress().toLowerCase(),
					faculty[i].getUcode().toLowerCase());
		System.out.println();
		for(int i=0;i<200;i++)
			System.out.print("_");
		
		System.out.println("\n\n\n");
		
		/*Display all faculty by sorting them based on empId. (ascending order)*/
		Faculty.sortempId(faculty);
		System.out.println("After sorting all faculty based on empId");
		for(int i=0;i<200;i++)
			System.out.print("_");
		//heading
		System.out.printf("\n%-20s%-13s%-5s$%-10s%-30s%-20s%-30s%-20s%-20s\n", 
				"Faculty Name".toUpperCase(),
				"Dept".toUpperCase(),
				"SSN".toUpperCase(),
				"Salary".toUpperCase(),
				"Area of Specialization".toUpperCase(),
				"Emplyee Id".toUpperCase(),
				"University name".toUpperCase(),
				"University address".toUpperCase(),
				"University code".toUpperCase());
		for(int i=0;i<200;i++)
			System.out.print("_");
		for(int i=0;i<faculty.length;i++)
			System.out.printf("\n%-20s%-13s%-5d$%-10.2f%-30s%-20d%-30s%-20s%-20s", 
					faculty[i].getfName().toLowerCase(),
					faculty[i].getDept().toLowerCase(),
					faculty[i].getSSN(),
					faculty[i].getSalary(),
					faculty[i].getAraeOfSpecialization().toLowerCase(),
					faculty[i].getEmpId(),
					faculty[i].getUname().toLowerCase(),
					faculty[i].getUaddress().toLowerCase(),
					faculty[i].getUcode().toLowerCase());
		System.out.println();
		for(int i=0;i<200;i++)
			System.out.print("_");
		
		System.out.println("\n\n\n");
		
		/*Display all students by calculating the average of the best two-course score.*/
		System.out.println("Before sorting students based on avg of top two scores");
		for(int i=0;i<200;i++)
			System.out.print("_");
		//heading
		System.out.printf("\n%-20s%-14s%-5s%-7s%-13s%-13s%-14s%-14s%-14s%-30s%-20s%-20s%-30s\n", 
				"Student Name".toUpperCase(),
				"Dept".toUpperCase(),
				"Id".toUpperCase(),
				"Degree".toUpperCase(),
				"Major".toUpperCase(),
				"Minor".toUpperCase(),
				"Course 1 score".toUpperCase(),
				"Course 2 score".toUpperCase(),
				"Course 3 score".toUpperCase(),
				"University name".toUpperCase(),
				"University address".toUpperCase(),
				"University code".toUpperCase(),
				"Avg of top two course".toUpperCase());
		for(int i=0;i<200;i++)
			System.out.print("_");
		for(int i=0;i<student.length;i++)
			System.out.printf("\n%-20s%-14s%-5s%-7s%-13s%-13s%-14.2f%-14.2f%-14.2f%-30s%-20s%-20s%-30.2f", 
					student[i].getsName().toLowerCase(),
					student[i].getDept().toLowerCase(),
					student[i].getStudID().toLowerCase(),
					student[i].getDegree().toLowerCase(),
					student[i].getMajor().toLowerCase(),
					student[i].getMinor().toLowerCase(),
					student[i].getCourse1Score(),
					student[i].getCourse2Score(),
					student[i].getCourse3Score(),
					student[i].getUname().toLowerCase(),
					student[i].getUaddress().toLowerCase(),
					student[i].getUcode().toLowerCase(),
					student[i].avgBestTwoCourseGrade());
		System.out.println();
		for(int i=0;i<200;i++)
			System.out.print("_");

		/*Display all students by sorting based on the best of two-course score average. (ascending order)*/
		
		
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student.length;j++) {
				if(student[i].sortAvgBestTwoCourseGrade(student[j])) {
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("\n\n\n");
		/*Display all students by calculating the average of the best two-course score.*/
		System.out.println("After sorting students based on avg of top two scores");
		for(int i=0;i<200;i++)
			System.out.print("_");
		//heading
		System.out.printf("\n%-20s%-14s%-5s%-7s%-13s%-13s%-14s%-14s%-14s%-30s%-20s%-20s%-30s\n", 
				"Student Name".toUpperCase(),
				"Dept".toUpperCase(),
				"Id".toUpperCase(),
				"Degree".toUpperCase(),
				"Major".toUpperCase(),
				"Minor".toUpperCase(),
				"Course 1 score".toUpperCase(),
				"Course 2 score".toUpperCase(),
				"Course 3 score".toUpperCase(),
				"University name".toUpperCase(),
				"University address".toUpperCase(),
				"University code".toUpperCase(),
				"Avg of top two course".toUpperCase());
		for(int i=0;i<200;i++)
			System.out.print("_");
		for(int i=0;i<student.length;i++)
			System.out.printf("\n%-20s%-14s%-5s%-7s%-13s%-13s%-14.2f%-14.2f%-14.2f%-30s%-20s%-20s%-30.2f", 
					student[i].getsName().toLowerCase(),
					student[i].getDept().toLowerCase(),
					student[i].getStudID().toLowerCase(),
					student[i].getDegree().toLowerCase(),
					student[i].getMajor().toLowerCase(),
					student[i].getMinor().toLowerCase(),
					student[i].getCourse1Score(),
					student[i].getCourse2Score(),
					student[i].getCourse3Score(),
					student[i].getUname().toLowerCase(),
					student[i].getUaddress().toLowerCase(),
					student[i].getUcode().toLowerCase(),
					student[i].avgBestTwoCourseGrade());
		System.out.println();
		for(int i=0;i<150;i++)
			System.out.print("_");
	}
	
	static int howMany(String msg){
		System.out.print(msg);
		return r.nextInt();
	}
	
	static String readString(String msg){
		System.out.print(msg);
		return r.nextLine();
	}
	
	static int readInt(String msg){
		System.out.print(msg);
		return r.nextInt();
	}
	
	static double readDouble(String msg){
		System.out.print(msg);
		return r.nextDouble();
	}
}
