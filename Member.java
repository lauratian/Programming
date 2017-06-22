
public class Member implements HasWeight {
	String name;
	int gradeLevel;
	String subteam;
	boolean isReturningMember;
	int weight;
	
	public Member(String names, int grade, String team, boolean returnMember){
		names = name;
		grade = gradeLevel;
		team = subteam;
		returnMember = isReturningMember;
	}
	
	public void graduate(){
		gradeLevel = gradeLevel + 1;
		isReturningMember = true;
	}
	
	public boolean isComputerSlave(){
		if (subteam.equals("programming") || subteam.equalsIgnoreCase("CAD") || subteam.equals("operations") || subteam.equals("PR") || subteam.equals("design")){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return gradeLevel;
	}
	
	public static char getFirstInitialOfName(String Initial){
		return Initial.charAt(0);
	}
	
	public void setWeight(int robotWeight){
		weight = robotWeight;
	}
	
	public int getWeight(){
		return weight;
	}
}
