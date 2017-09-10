package the_basics;

public class Card {
	int value, suit;
	String value_word, suit_word;
	public Boolean shown;
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
		shown = false;
		switch(suit) {
		case 0: suit_word = "Diamonds"; break;
		case 1: suit_word = "Hearts"; break;
		case 2: suit_word = "Spades"; break;
		case 3: suit_word = "Clubs";
		}
		switch(value) {
		case 11: value_word = "Jack"; break;
		case 12: value_word = "Queen"; break;
		case 13: value_word = "King"; break;
		case 14: value_word = "Ace";
		}
		if(value < 11)
		value_word = Integer.toString(value);
	}
	public String display() {
		shown = true;
		return value_word + " of " + suit_word;
	}
}
