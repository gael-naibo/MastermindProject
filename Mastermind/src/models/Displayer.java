package models;

import java.util.LinkedList;

public class Displayer {
	
	private void display(Board board){
		
		LinkedList<SimpleLine> liste = board.getSimpleline();
		
		for (SimpleLine simpleLine : liste) {
			Combination combination = simpleLine.getCombination();
		}
		
	}
	
}
