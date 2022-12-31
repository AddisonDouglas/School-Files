package Chap3;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		processName();
		
	}
	public static void processName() {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter full name:");
		String Name = myObj.nextLine();
		String reverse = new StringBuilder(Name).reverse().toString();
		System.out.println(reverse);
	}
}
