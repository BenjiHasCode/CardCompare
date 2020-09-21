import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void compareTo() {
        Card card = new Card(Value.King, Color.Diamonds);
        Card card2 = new Card(Value.Jack, Color.Clubs);
        assertEquals(1, card.compareTo(card2));

        Card card5 = new Card(Value.Ace, Color.Clubs);
        Card card6 = new Card(Value.Ace, Color.Clubs);
        assertEquals(0, card5.compareTo(card6));
    }
}