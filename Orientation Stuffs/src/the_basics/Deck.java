package the_basics;
import java.util.ArrayList;
public class Deck {
	public ArrayList<Card> deck_cards;
	public Deck() {
		deck_cards = new ArrayList<Card>();
		for(int i = 0; i<52; i++) {
			deck_cards.add(new Card(i%13+2, i%4));
		}
	}
	public void print_cards() {
		for (Card card : deck_cards) {
			card.display();
		}
	}
	public Card deal_card() {
		int i = 0;
		Card dealt;
		while(deck_cards.get(i) == null)
			i++;
		dealt = deck_cards.get(i);
		deck_cards.remove(i);
		return dealt;
	}
}
