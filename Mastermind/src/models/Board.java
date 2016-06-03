package models;

import java.util.LinkedList;

public class Board {
	
	private LinkedList<SimpleLine> lines;
	
	public LinkedList<SimpleLine> getSimpleline() {
		return lines;
	}

	public void setSimpleline(LinkedList<SimpleLine> simpleline) {
		this.lines = simpleline;
	}

	public Board(){
		this.lines = new LinkedList<SimpleLine>();
	}
	
	public void addLine(SimpleLine line){
		this.lines.add(line);
	}
}
