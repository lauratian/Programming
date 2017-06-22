
public interface HasWeight {
	public abstract int getWeight();
	
	default boolean isHeavy(){
		getWeight();
		if (getWeight() > 100){
			return true;
		}
		return false;
	}
}
