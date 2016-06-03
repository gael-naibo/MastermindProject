package models;

import java.util.LinkedList;

public class Board {
	
	private LinkedList<SimpleLine> simpleline;
	
	public Board(){
		this.simpleline = new LinkedList<SimpleLine>();
	}
	
	public void addLine(SimpleLine line){
		this.simpleline.add(line);
	}
}
