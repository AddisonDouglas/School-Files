package TestingArea;

import java.util.Scanner;

public class DeathRoll {
	public static void main(String[] args){
		gameStart();
	}
	public static void gameStart() {
		Scanner generlScanner = new Scanner(System.in);
		Scanner cleanScanner = new Scanner(System.in);
		int coin = startingMoney(); 
		System.out.println("Your starting Coin is "+ coin);
		int playerBet = bet(generlScanner, coin);
		coin = roll(playerBet, coin);
		keepPlaying(cleanScanner, coin, playerBet );
		
	}
	public static int startingMoney(){
		double max = 100;
		double min = 1000;
		int coins =(int)(Math.random() * (max - min) + min);
		return coins;
	}
	public static int bet(Scanner input, int coin) {
		while (true) {
			System.out.println("How much do you want to bet?");
		    int bet = input.nextInt();
		    if(bet <= coin & bet > 0) {
		    	return bet;
		    }
		}
	}
	public static int roll(int bet, int coin) {
		int playerRoll = 100;
		int computerRoll = 100;
		double max = bet;
		double min = 0;
		while(true) {
			if (playerRoll > 0 & computerRoll > 0) {
				playerRoll=(int)(Math.random() * (max - min) + min);
				max = playerRoll;
				System.out.println("Your role " + playerRoll);
			}
			if (computerRoll > 0 & playerRoll > 0) {
				computerRoll=(int)(Math.random() * (max - min) + min);
				max = computerRoll;
				System.out.println("Computer role " + computerRoll);
			}
			if(computerRoll == 0 || playerRoll == 0){
				break;
			}
		}
		if(computerRoll == 0) {
			System.out.println("You Win");
			coin = coin+bet;
			System.out.println("Your new balance is " +  coin);
		}
		else if(playerRoll == 0){
			System.out.println("You lose");
			coin= coin-bet;
			System.out.println("Your new balance is " +  coin);	
		}
		return coin;
	}

	public static void keepPlaying(Scanner input, int money, int bet) {
		while (true){
			if(money <=0) {
				System.out.println("bust");
				break;
			}
			System.out.println("Would you like to keep playing, Yes or No");
			String playerInput = input.nextLine();
			
			if(playerInput.equals("Yes") || playerInput.equals("yes")) {
				System.out.println(playerInput);
				newMatch(money);
				break;
			}
			else if(playerInput.equals("No") || playerInput.equals("no")) {
				System.out.println(bet);
				System.out.println("You leave with " + money  + " coins");
				break;
			}
			else {
				System.out.println("Not a valid answer");
				continue;
			}
		}
	}

	public static void newMatch(int coin) {
		System.out.println("You currently have " + coin +" coins");
		Scanner generlScanner = new Scanner(System.in);
		Scanner cleanScanner = new Scanner(System.in);
		int playerBet = bet(generlScanner, coin);
		int coins = roll(playerBet, coin);
		keepPlaying(cleanScanner, coins, playerBet);
	}
}

