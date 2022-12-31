package ex105;

public class TwoRockets {
	public static void main(String[] args) {
		tip(); 
		body();
		united();
		body();
		tip(); 
	



	}
	public static void tip() {
		System.out.println("   /\\        /\\");
		System.out.println("  /  \\      /  \\");
		System.out.println(" /    \\    /    \\");
		
	}
	public static void body() {
		System.out.println("+------+  +------+");
		System.out.println("|      |  |      |");
		System.out.println("|      |  |      |");
		System.out.println("+------+  +------+");
	}
	public static void united() {
		System.out.println("|United|  |United|");
		System.out.println("|states|  |states|");
	}

}
