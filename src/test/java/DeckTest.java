import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Hand hand;

    @Before
    public void before() {
        deck = new Deck();
        hand = new Hand();
    }

    @Test
    public void getCardCount() {
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffleDeck() {
        deck.shuffleDeck();
    }

    @Test
    public void canGetHandCards() {
        assertEquals(0, hand.getHandCards());
    }

    @Test
    public void canDealCard() {
        Card cardToDeal = deck.dealCard();
        hand.add(cardToDeal);
        assertEquals(1, hand.getHandCards());
    }
}
