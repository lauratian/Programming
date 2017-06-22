
public class FRCRobot implements HasWeight {
	private String name;
	private int weight;
	final int MAX_WEIGHT = 120;
	
	
	public FRCRobot(String robotName, int robotWeight){
		name = robotName;
		weight = robotWeight;
	}
	
	public String getName(){
		return name;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setName(String rName){
		name = rName;
	}
	
	public void setWeight(int rWeight){
		weight = rWeight;
	}
}
