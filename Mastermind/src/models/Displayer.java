package models;

import java.util.LinkedList;

public class Displayer {
	
	public void display(Board board){
		
		Combination combination;
		Correction correction;
		
		LinkedList<SimpleLine> liste = board.getSimpleline();
		
		for (SimpleLine simpleLine : liste) {
			combination = simpleLine.getCombination();
			correction= simpleLine.getCorrection();
			
			System.out.println(combination +" | "+ correction);
		}
	}
	
	public void display(String content){
		System.out.println(content);
	}
}
