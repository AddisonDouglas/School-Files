package TestingArea;

public class holdingcell {
	while (true){
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
