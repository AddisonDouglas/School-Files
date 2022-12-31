package Chap3;

import java.util.Scanner;

public class pokemonProject {
	static int Defense;
	static int health;
	static String poke;
	static String Attack;
	static String Base;
	static String Stab;
	static String SpAttack;
	static String SpDefense;
	static String Speed;
	static String moves;
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		battlestart(myObj);
		playerStats(myObj);
		damage();
		statTable();
	}
	public static void battlestart(Scanner input) {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared");
		System.out.println("Which Pokémon do you choose?");
		poke = input.nextLine();
		System.out.println("You chose" + " " + poke);
		System.out.println("It's a Pokémon battle between" + " " + poke + " and Zebstrika");
	}
	public static void playerStats(Scanner input) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your Arcanine’s stats?");
		System.out.println("Attack:");
		Attack = input.nextLine();
		System.out.println("Defense:");
		Defense = input.nextInt();
		input.nextLine();
		System.out.println("Base:");
		Base = input.nextLine();
		System.out.println("STAB:");
		Stab = input.nextLine();
		System.out.println("HP:");
		health = input.nextInt();
		input.nextLine();
		System.out.println("SpAttack:");
		SpAttack = input.nextLine();
		System.out.println("SpDefense:");
		SpDefense = input.nextLine();
		System.out.println("Speed:");
		Speed = input.nextLine();
		System.out.println("Moves:");
		moves = input.nextLine();


	}
	public static void damage() {
		System.out.println("");
		System.out.println("Combat Has begun");
		double max = 1.0;
		double min = .85;
		double bestnumber =(Math.random() * (max - min) + min);
		double dmg = (2*1+10/250 * 12/Defense * 2 + 2) * bestnumber;
		double new_hp = health-dmg;
		if(new_hp <= 0) {
			System.out.print(poke +" has fainted");
		}
		else {
			System.out.print(poke + " sustained " + dmg + " points damage. Hp is now ");
			System.out.print(health-dmg);

		}
		
			
	}
	public static void statTable() {
		System.out.println("");
		System.out.println("Name\t" +  poke);
		System.out.println("Level 1");
		System.out.println("-------------------");
		System.out.println("HP:       " +health);
		System.out.println("Attack:   " +Attack);
		System.out.println("Defense:  " +Defense);
		System.out.println("SpAttack: " +SpAttack);
		System.out.println("SpDefense:" +SpDefense);
		System.out.println("Speed:\t  " +Speed);
		System.out.println("-------------------");
		System.out.println("Moves Learned: " + moves);
	}

}

