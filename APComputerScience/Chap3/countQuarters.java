package Chap3;

public class countQuarters {
	public static void main(String[] args) {
		int coins = 7887;
		int n= countQuarter(coins);	
		System.out.println(n);
	}
	public static int countQuarter(int cents) {
	    return cents % 100 / 25;
	}
}
