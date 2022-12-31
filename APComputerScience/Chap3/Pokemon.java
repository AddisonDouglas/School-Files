package Chap3;


public class Pokemon {
	public static void main(String[] args)
	{
		//attack , defense , speed  , special attakc , special defesne 5+base(2)
		//hp 110+base(2)
		int Hp = 79;
		int attack = 83;
		int defense = 100;
		int special_attack = 85;
		int special_defense = 105;
		int speed = 78;
		Hp = Hpmath(Hp);
		attack = otherMath(attack);
		defense = otherMath(defense);
		special_attack = otherMath(special_attack);
		special_defense = otherMath(special_defense);
		speed = otherMath(speed);
		
		System.out.println("Hp: " + Hp);		
		System.out.println("attack: " + attack);
		System.out.println("defense: " + defense);
		System.out.println("special_attack: " + special_attack);
		System.out.println("special_defense: " + special_defense);
		System.out.println("speed: " + speed);
		
	}
	public static int Hpmath(int n) {
		return n*2+110;
		
	}
	public static int otherMath(int x) {
		return x*2+5;
		
	}
	
}

