package TestingArea;

import java.util.Scanner;

public class rando {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userNumber = getNextLine(userInput, "Favorite Number?");
		double bestnumber = (int)(Math.random() * 1000);
		if(userNumber==bestnumber ) {
			System.out.println("Correct");
		}
		else {
			System.out.println("wrong.");
			System.out.println(bestnumber);
		}
			
		
	}


public static int getNextLine(Scanner input, String text) {
	System.out.println(text);
	return input.nextInt();
}
}
