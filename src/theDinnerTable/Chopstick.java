package theDinnerTable;

public class Chopstick {
	private final int pos;
	private boolean inUse;
	
	Chopstick(int pos) {
		this.pos = pos;
		inUse = false;
	}
	
	public boolean isInUse() {
		return inUse;
	}
	
	public void pickUp() {
		inUse = true;
	}
	
	public void setDown() {
		inUse = false;
	}
}
