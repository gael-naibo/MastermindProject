package models;

import java.util.LinkedList;

public class Displayer {
	
	private void display(Board board){
		
		Combination combination;
		Correction correction;
		
		LinkedList<SimpleLine> liste = board.getSimpleline();
		
		for (SimpleLine simpleLine : liste) {
			combination = simpleLine.getCombination();
			correction= simpleLine.getCorrection();
			
			System.out.println(combination+" | "+correction);
		}
		
		
		
		
		
	}
	
}
