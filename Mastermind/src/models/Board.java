package models;

import java.util.LinkedList;

public class Board {
	
	private LinkedList<SimpleLine> simpleline;
	
	public LinkedList<SimpleLine> getSimpleline() {
		return simpleline;
	}

	public void setSimpleline(LinkedList<SimpleLine> simpleline) {
		this.simpleline = simpleline;
	}

	public Board(){
		this.simpleline = new LinkedList<SimpleLine>();
	}
	
	public void addLine(SimpleLine line){
		this.simpleline.add(line);
	}
}
