package models;

public class Combination {

	private Pawn pawn1;
	private Pawn pawn2;
	private Pawn pawn3;
	private Pawn pawn4;
	
	public Combination() {
		
	}
	
	public Pawn getPawn1() {
		return pawn1;
	}

	public void setPawn1(Pawn pawn1) {
		this.pawn1 = pawn1;
	}

	public Pawn getPawn2() {
		return pawn2;
	}

	public void setPawn2(Pawn pawn2) {
		this.pawn2 = pawn2;
	}

	public Pawn getPawn3() {
		return pawn3;
	}

	public void setPawn3(Pawn pawn3) {
		this.pawn3 = pawn3;
	}

	public Pawn getPawn4() {
		return pawn4;
	}

	public void setPawn4(Pawn pawn4) {
		this.pawn4 = pawn4;
	}

	public Combination(Pawn pawn1, Pawn pawn2, Pawn pawn3, Pawn pawn4) {
		this.pawn1=pawn1;
		this.pawn2=pawn2;
		this.pawn3=pawn3;
		this.pawn4= pawn4;
	}
	
	public static boolean CompareCombinations(Combination comb1, Combination comb2){
		if(comb1.getPawn1().getCOLOR().equals(comb2.getPawn1().getCOLOR()) &&
			comb1.getPawn2().getCOLOR().equals(comb2.getPawn2().getCOLOR())	&&
			comb1.getPawn3().getCOLOR().equals(comb2.getPawn3().getCOLOR()) &&
			comb1.getPawn4().getCOLOR().equals(comb2.getPawn4().getCOLOR())){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pawn1.getCOLOR().toString()+" " + pawn2.getCOLOR().toString() + " "+ pawn3.getCOLOR().toString()+ " "+pawn4.getCOLOR().toString();
		
	}
}
