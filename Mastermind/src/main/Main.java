package main;

import java.util.LinkedList;

import models.Board;
import models.ColorEnum;
import models.Combination;
import models.Displayer;
import models.Entry;
import models.Pawn;
import models.SimpleLine;

public class Main {

	public static void main(String[] args) {
		Displayer displayer = new Displayer();
		Board board = new Board();
		Entry entry = new Entry();
		
		
		
		displayer.display("Bienvenu sur notre jeu MasterMind !!!");
		
		displayer.display("TOUR DU JOUR 1.");
		displayer.display("VEUILLEZ CHOISIR UNE COMBINAISON.");
		
		Combination combinationToGuess = new Combination();
		
		combinationToGuess.setPawn1(new Pawn(check(entry.in("choix du pion 1"))));
		combinationToGuess.setPawn2(new Pawn(check(entry.in("choix du pion 2"))));
		combinationToGuess.setPawn3(new Pawn(check(entry.in("choix du pion 3"))));
		combinationToGuess.setPawn4(new Pawn(check(entry.in("choix du pion 4"))));
		
		LinkedList<SimpleLine> liste = new LinkedList<SimpleLine>();
		liste.add(new SimpleLine(combinationToGuess, null));
		board.setSimpleline(liste);
		displayer.display(board);
	}

	public static ColorEnum check(String string){
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
