package Chap3;
import java.util.Scanner;

public class birthday {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		inputBirthday(myObj);
		
	}
	public static void inputBirthday(Scanner input2) {
		String day = getNextLine(input2,"What day were you born?" );
		String month = getNextLine(input2,"What month were you born?" );
		String year = getNextLine(input2, "What year were you born");
		System.out.println("You were born on " + month + " " + day + ", " + year + ".");
	}
	public static String getNextLine(Scanner input, String text) {
		System.out.println(text);
		return input.nextLine();
	}
}
