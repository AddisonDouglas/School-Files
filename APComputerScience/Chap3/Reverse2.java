package Chap3;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		processName(myObj);
	}
	public static void processName(Scanner input) {
		System.out.println("Enter full name:");
	    String full=input.nextLine();
		int n = full.indexOf(" ");
	    String first=full.substring(0, n);
	    String second=full.substring(n, full.length());
		 System.out.print(second + " " + first);

	}
}
