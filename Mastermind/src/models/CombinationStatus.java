package models;

public enum CombinationStatus {
	WRONG,
	GOOD,
	NOT_HERE;
	
	@Override
	public String toString() {
		return super.name().replace("_", " ");
	}
}
