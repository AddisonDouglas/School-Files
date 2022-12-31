package ex105;

public class Lanterns {
	public static void main(String[] args) {
		stars();
		System.out.println("");
		stars();
		line();
		System.out.println("************");
		stars();
		System.out.println("");
		stars();
		star();
		line();
		line();
		star();
		star();
		
	}
	public static void stars() {
		System.out.println("   *****");
		System.out.println(" *********");
		System.out.println("************");
	}
	public static void line() {
		System.out.println("* | | | | | *");
	}
	public static void star() {
		System.out.println("   *****");
	}
	
	

}
