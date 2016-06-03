package models;

import java.util.Scanner;

public class Entry {

	public String in(String message){
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		scanner.close();
		return input;
		
	}
}
