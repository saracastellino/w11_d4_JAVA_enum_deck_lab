import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void addCards(Card card) {
        this.cards.add(card);
    }

    public void getFirstCard() {
        System.out.println(this.cards);
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card dealCard(){
//        return Card cardToDeal = cards.get(0);
        return cards.get(0);
    }
}


