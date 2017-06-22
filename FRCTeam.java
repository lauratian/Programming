
public class FRCTeam extends Team{
	private final FRCRobot robot;
	int [] games;
	
	public void getRobot(FRCRobot robots){
		robots = robot;
	}
	
	public FRCTeam(int teamNum, String name, int rookie, FRCRobot robots) {
		super(teamNum, name, rookie);
		robot = robots;
	}
	
	public void setGames(int [] game){
		games = game;
	}
	
	public int[] getGames(){
		return games;
	}
	
	public int getAverageScore(){
		int score = 0;
		int i = 0;
		for (int j : games){
			score = score + j;
			i++;
		}
		score = score / i;
		Math.round(score);
		return score;
	}
	
	@Override
	public String get2017Game() {
		return null;
	}

}
