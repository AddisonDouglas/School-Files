package ex107;

public class Letters {
	public static void main(String[] args) {
		Letter1();
		Letter2();
		Letter3();
	}
	public static void Letter1() {
		greeting();
		System.out.print("Name1");
		System.out.println("");
		body();
		System.out.println("Ps:The dog has not stopped eating shoes");
		Closing();
		

	}
	public static void Letter2() {
		greeting();
		System.out.print("Name2");
		System.out.println("");
		body();
		System.out.println("Ps:You owe me money");
		Closing();

	}
	public static void Letter3() {
		greeting();
		System.out.print("Name3");
		System.out.println("");
		body();
		System.out.println("Ps: I hope the kids are doing well");
		Closing();

	}
	public static void Closing() {
		System.out.println("Sinceraly,");
		System.out.println("Addison");
	}
	public static void greeting() {
		System.out.print("Dear,");
	}
	public static void body() {
		System.out.println("This is a letter to update you on my well being, I am infact doing well, \nthank you for reading my letter. I hope to never see you again");
	}


}
