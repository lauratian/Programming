import java.util.ArrayList;

public abstract class Team{
	String teamName;
	int teamNumber;
	ArrayList<Member> members;
	final int rookieYear;
	final int NUMBER_OF_FRC_TEAMS_IN_2017 = 3357;
	final String EXPANSION_OF_FIRST = "For Inspiration and Recognition of Science and Technology";
	
	public Team(int teamNum, String name, int rookie){
		teamNumber = teamNum;
		teamName = name;
		members = new ArrayList<>();
		rookieYear = rookie;
	}
	
	public abstract String get2017Game();
	
	public String getName(){
		return teamName;
	}
	
	public int getTeamNumber(){
		return teamNumber;
	}
	
	public int getRookieYear(){
		return rookieYear;
	}
	
	public void setName(String tName){
		teamName = tName;
	}
	
	public void setTeamNumber(int tNum){
		teamNumber = tNum;
	}
	
	public void addMember(){
		
	}
	
	
}
