package models;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entry {

	public static String REGEX = "(BLACK)|(WHITE)|(RED)|(BLUE)";
	public String in(String message, String regex){
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		return input;
		
	}
	
	public String inUntilRegexTrue(String message){
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		Matcher m;
		Pattern pattern = Pattern.compile(REGEX);
		String input;
		do{
			
			input = scanner.next();
			m = pattern.matcher(input);
			if(!m.matches())
			{
				System.out.println("Wrong COLOR ! Please choose either BLACK, WHITE, RED OR BLUE");
			}
		}while(!m.matches());
		return input;
	}
}
