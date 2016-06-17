package models;

import java.util.List;

public class Game {
	
	private Entry entry;
	public void Play (){
		
		Displayer displayer = new Displayer();
		Board board = new Board();
		boolean success=false;
		 entry = new Entry();
		
		Combination combinationToGuess = new Combination();
		
		displayer.display("Welcome into our best game ! MasterMind !!!");
		
		initPlayer1(displayer, combinationToGuess);
		
		displayer.display("Turn GAMER 2.");
		
		while(!success){
			turnPlayer2(board);
			List<CombinationStatus> status = checkPawns(board,combinationToGuess);
			success = true;
			for (CombinationStatus cs : status) {
				if (!cs.equals(CombinationStatus.GOOD)) {
					success = false;
					break;
				}
			}
			
			if(!success){
				displayer.display(	"WRONG COMBINATION ! " +
									status.get(0).toString() + " | " +
									status.get(1).toString() + " | " +
									status.get(2).toString() + " | " +
									status.get(3).toString()
				);
			}
		}
		
		displayer.display("Your skills are approved by MasterMind !");		
	}

	private List<CombinationStatus> checkPawns(Board board, Combination combinationToGuess) {
		return combinationToGuess.compute(board.getSimpleline().getLast().getCombination());
	}

	private void initPlayer1(Displayer displayer, Combination combinationToGuess) {
		displayer.display("TURN GAMER 1.");
		displayer.display("Please choose a combination. (RED | BLACK | WHITE | BLUE)");
		
		combinationToGuess.setPawn1(new Pawn(check(entry.inUntilRegexTrue("Pawn 1"))));
		combinationToGuess.setPawn2(new Pawn(check(entry.inUntilRegexTrue("Pawn 2"))));
		combinationToGuess.setPawn3(new Pawn(check(entry.inUntilRegexTrue("Pawn 3"))));
		combinationToGuess.setPawn4(new Pawn(check(entry.inUntilRegexTrue("Pawn 4"))));
	}
	
	private void turnPlayer2(Board board){
		
		
		choicePawnsP2(board);
		
	}

	public void choicePawnsP2(Board board) {
		Combination combination=new Combination();
		combination.setPawn1(new Pawn(check(entry.inUntilRegexTrue("choix du pion 1"))));
		combination.setPawn2(new Pawn(check(entry.inUntilRegexTrue("choix du pion 2"))));
		combination.setPawn3(new Pawn(check(entry.inUntilRegexTrue("choix du pion 3"))));
		combination.setPawn4(new Pawn(check(entry.inUntilRegexTrue("choix du pion 4"))));
		SimpleLine line=new SimpleLine(combination,null);
		board.addLine(line);
	}
	
	
	
	private  ColorEnum check(String string){
		switch (string) {
		case "BLUE":
			return ColorEnum.BLUE;
		case "RED":
			return ColorEnum.RED;
		case "BLACK":
			return ColorEnum.BLACK;
		case "WHITE":
			return ColorEnum.WHITE;
		default:
			return null;
		}
	}

}
