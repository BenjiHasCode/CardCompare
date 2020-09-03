import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();

    public void fillDeck(){
        //add hearts
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Hearts"));
        }
        //add diamonds
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Diamonds"));
        }
        //add spades
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Spades"));
        }
        //add clubs
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Clubs"));
        }
    }
}
