package Chap3;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number between 1-12");
		int x = myObj.nextInt();
		int y = daysInMonth(x);
		System.out.println(y);
	}
	public static int daysInMonth(int month) {
		int x = 11;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{

			x = 31;
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
	
			 x = 30;
		}  
		else if ( month == 2 )
		{
			 x = 28;
		} 
		return x;

	}
		
	}


