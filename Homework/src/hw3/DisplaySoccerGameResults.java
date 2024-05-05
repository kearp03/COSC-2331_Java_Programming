package hw3;

public class DisplaySoccerGameResults {
	public static void main(String[] args) {
		SoccerGameScoreBoard machesterUnited = new SoccerGameScoreBoard("Machester United",3,1,5);
		SoccerGameScoreBoard liverpool = new SoccerGameScoreBoard("Liverpool",3,1,4);
		SoccerGameResults results1 = grabGameResults(machesterUnited,liverpool);
		displayResults(results1);
		
		
		/* create two more teams by using constructor chaining and display the result 
		 * in the same way as did with liverpool and machesterUnited*/
		SoccerGameScoreBoard team1 = new SoccerGameScoreBoard("Houston Dyanamo");
		SoccerGameScoreBoard team2 = new SoccerGameScoreBoard("Austin");
		//Creates a SoccerGameResults objects and displays the results of the match
		SoccerGameResults results2 = grabGameResults(team1, team2);
		displayResults(results2);
	}
	
	public static SoccerGameResults grabGameResults(SoccerGameScoreBoard team1,SoccerGameScoreBoard team2){
		//Creates a temporary SoccerGameResults object 
		SoccerGameResults temp = new SoccerGameResults();
		
		//Compares goals in different parts of the game and assigns values to temp's variables accordingly
		if(team1.goalsInMatch > team2.goalsInMatch) {
			temp.sWinnerTeam = team1.sTeamName;
			temp.sLoserTeam = team2.sTeamName;
			temp.wonByGoalsInMatch = true;
		} else if(team2.goalsInMatch > team1.goalsInMatch) {
			temp.sWinnerTeam = team2.sTeamName;
			temp.sLoserTeam = team1.sTeamName;
			temp.wonByGoalsInMatch = true;
		} else if(team1.goalsInExtraTime > team2.goalsInExtraTime) {
			temp.sWinnerTeam = team1.sTeamName;
			temp.sLoserTeam = team2.sTeamName;
			temp.wonByGoalsInExtraTime = true;
		} else if(team2.goalsInExtraTime > team1.goalsInExtraTime) {
			temp.sWinnerTeam = team2.sTeamName;
			temp.sLoserTeam = team1.sTeamName;
			temp.wonByGoalsInExtraTime = true;
		} else if(team1.goalsInPenaltyShootOut > team2.goalsInPenaltyShootOut) {
			temp.sWinnerTeam = team1.sTeamName;
			temp.sLoserTeam = team2.sTeamName;
			temp.wonByGoalsInPenaltyShootOut = true;
		} else if(team2.goalsInPenaltyShootOut > team1.goalsInPenaltyShootOut) {
			temp.sWinnerTeam = team2.sTeamName;
			temp.sLoserTeam = team1.sTeamName;
			temp.wonByGoalsInPenaltyShootOut = true;
		} else {
			temp.sWinnerTeam = team1.sTeamName;
			temp.sLoserTeam = team2.sTeamName;
			temp.DrawByTie = true;
		}
		
		//Returns the memory address of temp
		return temp;
	}
	
	//Method to display the results of a soccer match  
	static void displayResults(SoccerGameResults results) {
		if(results.wonByGoalsInMatch) {
			System.out.println(results.sWinnerTeam+" vs "+results.sLoserTeam+" and the winner is "+results.sWinnerTeam);
		} else if (results.wonByGoalsInExtraTime) {
        	System.out.println(results.sWinnerTeam+" vs "+results.sLoserTeam+" and the winner is "+results.sWinnerTeam+" in Extra Time");
        } else if (results.wonByGoalsInPenaltyShootOut) {
        	System.out.println(results.sWinnerTeam+" vs "+results.sLoserTeam+" and the winner is "+results.sWinnerTeam+" in Penalty Shootout");
        } else {
        	System.out.println(results.sWinnerTeam+" vs "+results.sLoserTeam+" and the ended with tie");
        }
	}
}
