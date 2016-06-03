package models;


public class SimpleLine {
	private Combination combination;
	private Correction correction;
	
	public SimpleLine(){
		
	}
	
	public SimpleLine(Combination combination, Correction correction){
		this.combination = combination;
		this.correction = correction;
	}

	public Combination getCombination() {
		return combination;
	}

	public void setCombination(Combination combination) {
		this.combination = combination;
	}

	public Correction getCorrection() {
		return correction;
	}

	public void setCorrection(Correction correction) {
		this.correction = correction;
	}
}


