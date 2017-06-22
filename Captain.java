
public class Captain extends Member {
	String title;
	
	public Captain(String names, int grade, String team, Boolean returnMember, String label){
		super(names, grade, team, returnMember);
		label = title;
	}
	
	public String getTitle(){
		if (super.subteam.equals("operations") || super.subteam.equals("PR") || super.subteam.equals("Design") && title.equals("Captain")){
			title = "Business Captain";
			return title;
		}
		
		else if (super.subteam.equals("Mechanical") || super.subteam.equals("CAD") || super.subteam.equals("Electrical") || super.subteam.equals("programming") && title.equalsIgnoreCase("Captain")){
			title = "Engineering Captain";
			return title;
		}
		return null;
	}
	
	public boolean isComputerSlave(){
		return false;
	}
}
