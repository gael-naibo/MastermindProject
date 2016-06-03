package models;

public class Correction {
	private CorrectionEnum CORRECT_1;
	private CorrectionEnum CORRECT_2;
	private CorrectionEnum CORRECT_3;
	private CorrectionEnum CORRECT_4;
	
	public Correction(){
		
	}
	
	public Correction(CorrectionEnum correct_1, CorrectionEnum correct_2, CorrectionEnum correct_3, CorrectionEnum correct_4){
		this.CORRECT_1 = correct_1;
		this.CORRECT_2 = correct_2;
		this.CORRECT_3 = correct_3;
		this.CORRECT_4 = correct_4;
	}
}
