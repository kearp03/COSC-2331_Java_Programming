package hw4;
import java.util.Scanner;

/* BankFinder class finds loan provider by collecting three pieces of information --> loan amount, annual interest, and number of years to pay back in installments, 
 * prints the loan providers by sorting providers in alphabetical order or ascending order of annualInterestRate 
 * prints the loan providers whose anuualInterestRate is less than or equal to the requested rate
 */

public class BankFinder {
	/*counts the number of loan providers based on the criteria*/
	int count;
	private static final Scanner input = new Scanner(System.in);

	/*Finds loan providers based on supplied information*/
	public static void findLoanProvider() {
		BankFinder c = new BankFinder();


		Bank banks[] = new Bank[Bank.howMany()];
		for(int i = 0; i < banks.length; i++) {
			banks[i] = new Bank();
		}

		/*sort banks in alphabetical order based on bank names*/
		sortBank(banks, "names");
		Bank.printBanksCodes(banks);

		System.out.print("Enter annual interest rate within (1.00-10.00): ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		Bank matchedBanks[] = new Bank[banks.length];

		/*sort banks in ascending order based on AnnualInterestRate*/
		sortBank(banks, 0.0);

		/*Display bank name, bank code, AnnualInterestRate, loan amount, monthly payment, numberOfMonths, total payment, quote created date*/ 
		for(int i = 1; i < 173; i++) System.out.print("_");
		System.out.printf("\n|%-30s%10s%20s%20s%20s%20s%20s%30s|\n",
				"Banks","Codes","AnnualInterestRate","LoanAmount", 
				"monthlyPayment","numberOfMonths","totalPayment","Date");
		for(int i = 1; i < 175-2; i++) System.out.print("_");
		System.out.println();


		/*find loan providers*/
		for(int i = 0; i < banks.length; i++) {
			matchedBanks[i] = findMatch(banks[i], annualInterestRate, numberOfYears, loanAmount, c);
		}
		for(int i = 1; i < 175-2; i++) System.out.print("_");
		
		/*print total match found-->count of loan providers*/
		System.out.println("\n" + c.count + " Match found");        
	}

	/* get each loan provider matches the criteria --> AnnualInterestRate less than or equal to user requested AnnualInterestRate*/
	public static Bank findMatch(Bank bank, double annualInterestRate, int numberOfYears, double loanAmount, BankFinder c) {
		return new Bank(bank, annualInterestRate,  numberOfYears, loanAmount, c);
	}

	/*sort banks based on annualInterestRate*/
	public static void sortBank(Bank b[], double typeValue) {
		/*write your code*/
		//loops through the b array
		for(int i = 0; i < b.length-1; i++) {
			//loops forward from position i
			for(int j = i+1; j < b.length; j++) {
				//compares position i's annual interest rate and position j's annual interest rate
				//if position i's is greater than position j's, then it swaps the two elements
				if(b[i].loanInfo.getAnnualInterestRate() > b[j].loanInfo.getAnnualInterestRate()) {
					//swaps elements i and j
					Bank temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}

	/*sort banks based on bank names alphabetically*/
	public static void sortBank(Bank b[], String typeValue) {
		/*write your code*/
		//loops through the b array
		for(int i = 0; i < b.length-1; i++) {
			//loops forward from position i
			for(int j = i+1; j < b.length; j++) {
				//compares position i's bank name an position j's bank name
				//if position i's bank name comes after position j's bank name alphabetically,
				//then it swaps the two elements
				if(b[i].getBankName().compareTo(b[j].getBankName()) > 0) {
					//swaps elements i and j
					Bank temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
}
