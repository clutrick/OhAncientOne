import java.util.*;

public class Player {

	private String name;
	private ArrayList<Card> hand;
	
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void printHand() {
		System.out.println(name + "'s hand:");
		for (Card card:hand) {
			card.printInfo();
		}
	}

	
}
