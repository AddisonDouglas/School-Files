package Chap3;

public class Exercise2 {
	public static void main(String[] args) {
		double n = distance(1, 2, 3 ,4 );
		System.out.println(n);
		
	}
	public static double distance(int x1, int x2, int y1, int y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	

}
