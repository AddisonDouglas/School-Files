package Chap3;

public class ex1 {
	public static void main(String[] args) {
		int number = 10;
		for(int count = 1; count<=number;) {
			System.out.print("[" + count + "]");
			count = printNumbers(count);
	}
	
}
	 public static int printNumbers(int number) {
			return number+1;

}
}
