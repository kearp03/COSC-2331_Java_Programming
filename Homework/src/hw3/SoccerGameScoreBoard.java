package hw3;
import java.util.Scanner;

public class SoccerGameScoreBoard {
	//Creates class fields
	String sTeamName;
	int goalsInMatch, goalsInExtraTime, goalsInPenaltyShootOut;
	static int countTeams;
	private static Scanner scan = new Scanner(System.in);
	
	//static block to initialize static fields 
	static {
		countTeams = 0;
	}
	
	/* include constructor chaining so that you can create an object with only the team name, later
	 * in chaining, you can use a read method to read the rest of the field value
	 * hint: while calling the next constructor, you can place a call to read function as
	 * argument in the constructor call
	 * */
	
	//Constructors with chaining, calls the next constructor with the next value read
	SoccerGameScoreBoard(String sTeamName) {
		this(sTeamName, readI(sTeamName + ":\nGoals in Match"));
	}
	
	SoccerGameScoreBoard(String sTeamName, int goalsInMatch) {
		this(sTeamName, goalsInMatch, readI("Goals in Extra Time"));
	}
	
	SoccerGameScoreBoard(String sTeamName, int goalsInMatch, int goalsInExtraTime) {
		this(sTeamName, goalsInMatch, goalsInExtraTime, readI("Goals in Penalty Shootout"));
	}
	
	SoccerGameScoreBoard(String sTeamName, int goalsInMatch, int goalsInExtraTime, int goalsInPenaltyShootOut) {
		this.sTeamName = sTeamName;
		this.goalsInMatch = goalsInMatch;
		this.goalsInExtraTime = goalsInExtraTime;
		this.goalsInPenaltyShootOut = goalsInPenaltyShootOut;
		countTeams++;
	}
	
	//static method to read integers
	static int readI(String msg) {
		System.out.print(msg + ": ");
		return scan.nextInt();
	}
	
	//toString override method
	@Override
	public String toString() {
		return "SoccerGameScoreBoard [sTeamName=" + sTeamName + ", goalsInMatch=" + goalsInMatch + ", goalsInExtraTime="
                           + goalsInExtraTime + ", goalsInPenaltyShootOut=" + goalsInPenaltyShootOut + "]";
	}
}
