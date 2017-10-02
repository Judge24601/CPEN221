package the_basics;
import java.util.ArrayList;
public class Player_Hand implements Hand{
	private ArrayList<Card> held_cards;
	public void AddCards(Card card) {
		held_cards.add(card);
	}
	public Player_Hand() {
		held_cards = new ArrayList<Card>();
	}
}
