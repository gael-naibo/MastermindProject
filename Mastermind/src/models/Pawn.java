package models;

public class Pawn {
	private ColorEnum COLOR;
	
	public ColorEnum getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(ColorEnum cOLOR) {
		COLOR = cOLOR;
	}

	public Pawn(ColorEnum color){
		this.COLOR = color;
	}
}
