package untitwo;

public class MutipleParameters {
	public static void main(String[] args){    
		writeChars('*', 20);
		System.out.println();
		for (int i = 10; i >= 0; i--){
			writeChars('\\', i);
			writeChars('$', 20 - 2 * i);
			writeChars('\\', i);	
			System.out.println();
		}
		writeChars('*', 20);
	}
	public static void writeChars (char ch, int number) {
		for (int i = 1; i <= number; i++){
			System.out.print(ch);
		}
	}
	}



