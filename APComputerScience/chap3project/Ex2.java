package chap3project;

public class Ex2 {
	public static void main(String[] args) {
		double Baltimare = distance(29, 16, 34, 8);
		System.out.println("Distance: " + Baltimare);
		double Los_Pegasus = distance(6, 19, 22, 7);
		System.out.println("Distance: " + Los_Pegasus);
		double Badlands  = distance(25, 24 , 16 ,14);
		System.out.println("Distance: " + Badlands );

	}
	public static double distance(int x1, int y1, int x2, int y2) {
		@SuppressWarnings("unused")
		double distance;
		return distance=Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

		
		
	}


}
