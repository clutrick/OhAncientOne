import java.util.*;

public class Table {
	
	
	public Table() {
	// take stuff out of the main method and put here
		
		Scanner scan = new Scanner(System.in);
		
		Deck deck = new Deck();
		
		ArrayList<Player> players = new ArrayList<Player>(); // fix this stuff for player construct	

		System.out.println("How many players?"); 
		int numUsers = scan.nextInt();
		if (numUsers < 3 || numUsers > 7) {
			System.out.println("No less than 3 and no more than 6 players can play.");
			System.out.println("Please enter the number of players you want to play: ");
			numUsers = scan.nextInt();
		}
		
		//for (int c = 0; c <)
		
		for (int i = 0; i < numUsers - 1; i++) {
			System.out.println("Name of player " + i + " :");
			String playerName = scan.next();
			
			Player player = new Player(playerName);
			players.add(playerName);	
		}
		
		for (int j = 0; j<deck.getSize();j++)
			{
				int personCount = 0;
				while(personCount < players.size() && deck.getSize() >= 1 )
				{
					Card acard = deck.deal();
					players.get(personCount).addCard(acard);
					personCount++;
				}
			}	
		
	}	

	public static void main(String[] args) {
		
		// switch statement for languages
		System.out.println("Are you destined to die alone?");
		System.out.println("Find out by playing Oh, Ancient One");
		System.out.println("Rules:");
		System.out.println("Rule 1: Obey all rules.");
		System.out.println("Fact 1: There is no winner in this game...");
		System.out.println("ONLY ONE UNFORTUNATE BACHELOR OR BACHELORETTE.");
		System.out.println("Rule 2: Take cards that (match regardless of suit) ");
		System.out.println("Rule 3: Players choose a card at random from the player to their left.");
		
		// finish rules later
		
	
		
	
		
	}


}
