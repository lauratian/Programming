
public abstract class Game {
	private int blueAllianceScore;
	private int redAllianceScore;
	
	public Game(int blueScore, int redScore){
		blueAllianceScore = blueScore;
		redAllianceScore = redScore;
	}
	
	public void setBlueAllianceScore(int blueScore){
		blueAllianceScore = blueScore;
	}
	
	public void setRedAllianceScore(int redScore){
		redAllianceScore = redScore;
	}
	
	public int getBlueAllianceScore(){
		return blueAllianceScore;
	}
	
	public int getRedAllianceScore(){
		return redAllianceScore;
	}
}
