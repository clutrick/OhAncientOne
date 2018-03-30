
public class Card {

	private String suit;
	private String face;
	private int faceValue;
	
	public Card(String suit, String face, int faceValue) {
		super();
		this.suit = suit;
		this.face = face;
		this.faceValue = faceValue;
	}
	
	public void printInfo() {
		System.out.println(face + " of " + suit);
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaveValue(int faveValue) {
		this.faceValue = faveValue;
	}

	
	
}
