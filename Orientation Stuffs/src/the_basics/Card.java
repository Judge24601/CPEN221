package the_basics;

public class Card {
	private int value, suit;
	public Boolean shown;
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
		shown = false;
	}
}
