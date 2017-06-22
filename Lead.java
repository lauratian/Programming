
public class Lead extends Member {
	String title;
	
	public Lead(String names, int grade, String team, Boolean returnMember, String label){
		super(names, grade, team, returnMember);
		label = title;
	}
	
	public String getTitle(){
		if (title.equals("Lead")){
			title = subteam + " Lead";
			return title;
		}
		return null;
	}
	
	public boolean isComputerSlave(){
		return true;
	}
}
