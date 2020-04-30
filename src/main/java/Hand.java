import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> handCards;

    public Hand() {
        this.handCards = new ArrayList<Card>();
    }

    public void add(Card cardToDeal) {
        this.handCards.add(cardToDeal);
    }

    public int getHandCards() {
        return this.handCards.size();
    }
}
