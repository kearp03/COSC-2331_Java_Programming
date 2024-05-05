package lab9.exe1;
import java.util.Scanner;

public class UniversityTest {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//creates array of Faculty objects and array of Student objects
		Faculty[] faculty = new Faculty[readInt("Enter the number of Faculty")];
		Student[] students = new Student[readInt("Enter the number of Students")];
		
		//initializes all objects in faculty array
		for(int i = 0; i < faculty.length; i++) {
			System.out.println();
			faculty[i] = 
					new Faculty(readString("Faculty name"), readString("Department"), readInt("SSN"), 
					readDouble("Salary"), readString("Area of Specialization"), readInt("Employee ID"), 
					readString("University name"), readString("University address"), readString("University code"));
		}
		
		//initializes all objects in students array
		for(int i = 0; i < students.length; i++) {
			System.out.println();
			students[i] = 
					new Student(readString("Student name"), readString("Department"), readString("Student ID"), 
					readString("Degree"), readString("Major"), readString("Minor"), readDouble("Course 1 Score"), 
					readDouble("Course 2 Score"), readDouble("Course 3 Score"), readString("University name"), 
					readString("University address"), readString("University code"));
		}
		
		//sorts faculty array and then prints each object
		Faculty.sortempId(faculty);
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", 
				"Name", "Dept", "SSN", "Salary", "Area of Specialization", "empId", "Uname", "Uaddress", "Ucode");
		for(int i = 0; i < faculty.length; i++) {
			System.out.println(faculty[i]);
		}
		
		//prints each Student object and the average score in their top two courses
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", 
				"Name", "Dept", "Student ID", "Degree", "Major", "Minor", "Course 1 Score", "Course 2 Score", 
				"Course 3 Score", "Best Average", "Uname", "Uaddress", "Ucode");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		//sorts students array based on their average top courses grade
		//prints each object as well
		System.out.printf("\n%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", 
				"Name", "Dept", "Student ID", "Degree", "Major", "Minor", "Course 1 Score", "Course 2 Score", 
				"Course 3 Score", "Best Average", "Uname", "Uaddress", "Ucode");
		for(int i = 0; i < students.length-1; i++) {
			for(int j = i+1; j < students.length; j++) {
				if(students[i].sortAvgBestTwoCourseGrade(students[j])) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
			System.out.println(students[i]);
		}
	}
	
	//method to read Strings
	static String readString(String msg) {
		System.out.print(msg + ": ");
		return scan.nextLine();
	}
	
	//method to read ints
	static int readInt(String msg) {
		System.out.print(msg + ": ");
		int temp = scan.nextInt();
		scan.nextLine();
		return temp;
	}
	
	//method to read doubles
	static double readDouble(String msg) {
		System.out.print(msg + ": ");
		double temp = scan.nextDouble();
		scan.nextLine();
		return temp;
	}
}