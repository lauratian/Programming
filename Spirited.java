
public interface Spirited {
	public String showTeamSpirit();
	
	public default void chant(int n){
		if (n > 0){
			System.out.println(showTeamSpirit());
			n--;
		}
	}
}
