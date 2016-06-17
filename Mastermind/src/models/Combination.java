package models;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<CombinationStatus> compute(Combination tried){
		List<CombinationStatus> status = new ArrayList<>(4);
		
		status.add(comparePawnWithSolution(tried.getPawn1(), this.getPawn1()));
		status.add(comparePawnWithSolution(tried.getPawn2(), this.getPawn2()));
		status.add(comparePawnWithSolution(tried.getPawn3(), this.getPawn3()));
		status.add(comparePawnWithSolution(tried.getPawn4(), this.getPawn4()));
		
		return status;
	}
	
	private CombinationStatus comparePawnWithSolution(Pawn pawn, Pawn solution) {
		CombinationStatus status = CombinationStatus.WRONG;
		if (pawn.getCOLOR().equals(solution.getCOLOR()))
			status = CombinationStatus.GOOD;
		else if (contains(pawn))
			status = CombinationStatus.NOT_HERE;
		
		return status;
	}

	private boolean contains(Pawn pawn) {
		if (	pawn.getCOLOR().equals(pawn1.getCOLOR())
			||	pawn.getCOLOR().equals(pawn2.getCOLOR())
			||	pawn.getCOLOR().equals(pawn3.getCOLOR())
			||	pawn.getCOLOR().equals(pawn4.getCOLOR()))
			
			return true;
		
		return false;
		
	}

	@Override
	public String toString() {
		return pawn1.getCOLOR().toString()+" " + pawn2.getCOLOR().toString() + " "+ pawn3.getCOLOR().toString()+ " "+pawn4.getCOLOR().toString();
		
	}
}
