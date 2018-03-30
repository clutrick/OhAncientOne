import java.util.*;

public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>(); 
	
	public Deck() {
		generateDeck();
	}
	
	public Card deal() {
		Random rand = new Random();
		int position = rand.nextInt(deck.size()); 
		Card aCard = deck.get(position); 
		deck.remove(position);
		return aCard;
	}
	
	private void generateDeck() {
		ArrayList<String> suits = new ArrayList<String>(); // {"Spades", "Hearts", "Clubs", "Diamonds"};
		ArrayList<String> faces = new ArrayList<String>(); // String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Beyonce", "King"};
		ArrayList<Integer> faceValue = new ArrayList<Integer>(); // = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int i = 0;
		int j = 0;
		int deckCounter = 0;
		
		for (i = 0; i < suits.size(); i++) {
			for (j = 0; j < faces.size(); j++) {
				Card aCard = new Card(suits.get(i), faces.get(j), faceValue.get(j));
				deck.add(aCard); 
				deckCounter++;
			}
		
		//deck[52] = 	new Card(1,Card.JOKER);
		}
		Card joker = new Card("","JOKER",0);
		deck.add(joker);
	
		// http://math.hws.edu/javanotes/source/chapter5/Deck.java
	}
	
	public int getSize()
	{
		return deck.size();
	}
	
	
}
