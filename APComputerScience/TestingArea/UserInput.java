package TestingArea;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter age:");
	    int age = myObj.nextInt();

	}

}
/*    @SuppressWarnings("resource")
Scanner myObj = new Scanner(System.in);  // Create a Scanner object
System.out.println("Enter username");
String userName = myObj.nextLine();  // Read user input
System.out.println("Username is: " + userName);  // Output user input
*/