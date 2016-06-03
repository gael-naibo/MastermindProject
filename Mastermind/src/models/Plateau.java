package models;

import java.util.LinkedList;

public class Plateau {
	
	private LinkedList<SimpleLine> simpleline;
	
	public Plateau(){
		this.simpleline = new LinkedList<SimpleLine>();
	}
	
	public void addLine(SimpleLine line){
		this.simpleline.add(line);
	}
}
