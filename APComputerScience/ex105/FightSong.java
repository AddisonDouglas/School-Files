package ex105;

public class FightSong {
	public static void main(String[] args) {
		Go();
		System.out.println("");
		combo();
		System.out.println("");
		combo();
		System.out.println("");
		Go();
		
	}
	public static void Go() {
		System.out.println("Go, team, go!\nYou can do it.");
		
		
	}
	public static void West() {
		System.out.println("You're the best\nin the west");
		
	}
	public static void combo() {
		Go();
		System.out.println("You're the best\nin the west");
		Go();

	}
				
}
