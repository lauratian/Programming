
public class FRCGame extends Game {
	private FRCTeam red1;
	private FRCTeam red2;
	private FRCTeam red3;
	private FRCTeam blue1;
	private FRCTeam blue2;
	private FRCTeam blue3;
	private FRCTeam team;
	private boolean redAlli = false;
	private boolean blueAlli = false;
		
	public FRCGame(FRCTeam r1, FRCTeam r2, FRCTeam r3, FRCTeam b1, FRCTeam b2, FRCTeam b3, int blueScore, int redScore, FRCTeam rTeam) {
		super(blueScore, redScore);
		red1 = r1;
		red2 = r2;
		red3 = r3;
		blue1 = b1;
		blue2 = b2;
		blue3 = b3;
		team = rTeam;
	}
	
	public void setRed1(FRCTeam r1){
		red1 = r1;
	}
	
	public void setRed2(FRCTeam r2){
		red2 = r2;
	}
	
	public void setRed3(FRCTeam r3){
		red3 = r3;
	}
	
	public void setBlue1(FRCTeam b1){
		blue1 = b1;
	}
	
	public void setBlue2(FRCTeam b2){
		blue2 = b2;
	}
	
	public void setBlue3(FRCTeam b3){
		blue3 = b3;
	}
	
	public FRCTeam getBlue1(){
		return blue1;
	}
	
	public FRCTeam getBlue2(){
		return blue2;
	}
	
	public FRCTeam getBlue3(){
		return blue3;
	}
	
	public FRCTeam getRed1(){
		return red1;
	}
	
	public FRCTeam getRed2(){
		return red2;
	}
	
	public FRCTeam getRed3(){
		return red3;
	}
	
	public boolean isBlueAlliance(){
		if (team.equals(blue1) || team.equals(blue2) || team.equals(blue3)){
			blueAlli = true;
			return true;
		}
		return false;
	}
	
	public boolean isRedAlliance(){
		if (team.equals(red1) || team.equals(red2) || team.equals(red3)){
			redAlli = true;
			return true;
		}
		return false;
	}
	
	public int getAllianceScore(){
		if (redAlli = true){
			return getRedAllianceScore();
		}
		else if (blueAlli = true){
			return getBlueAllianceScore();
		}
		return -1;
	}
}
