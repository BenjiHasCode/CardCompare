import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void drawCard() {
        Deck deck = new Deck();
        Card card = deck.drawCard();
        Card card2 = deck.drawCard();

        assertNotNull(card);
        assertNotNull(card2);
        assertEquals(50, deck.size());
    }

    @Test
    void size() {
        Deck deck = new Deck();
        assertEquals(52, deck.size());
    }
}