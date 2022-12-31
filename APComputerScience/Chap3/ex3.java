package Chap3;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the month(1-12)");
		int month = myObj.nextInt();
		System.out.print("Enter the day(1-31)");
		int day = myObj.nextInt();
		System.out.print(season(month, day));
		
	}
	public static String season(int month, int date){
		String x ="hold";
		if(month >= 7 && month <= 8 || month == 6 && date >= 16 || month==9 && date <=15) {
			 x = "summer";
			return "summer";
		}
		else if( month >= 1 && month <= 2 || month == 12 && date >= 16 || month==3 && date <=15){
			 x = "winter";
			return "winter";
		}
		else if(month >= 10 && month <= 11 || month == 9 && date >= 16 || month==12 && date <=15) {
			 x = "fall";
			return "fall";
		}
		else if(month >= 4 && month <= 5 || month == 3 && date >= 16 || month==6 && date <=15) {
			 x = "spring";
			return "spring";
		}
		return x;
		
	}

}
