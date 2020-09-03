import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck(){
        //add hearts
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Hearts"));
        }
        /*for(int i = 0; i < 13; i++){
            deck.get(i).value =+ 3;
        }*/
        //add diamonds
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Diamonds"));
        }
      /*  for(int i = 13; i < 26; i++){
            deck.get(i).value =+ 2;
        }*/
        //add spades
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Spades"));
        }
       /* for(int i = 26; i < 39; i++){
            deck.get(i).value =+ 4;
        }*/
        //add clubs
        for(int i = 0; i < 13; i++){
            deck.add(new Card(i+1,"Clubs"));
        }
       /* for(int i = 39; i < 52; i++){
            deck.get(i).value =+ 1;
        }*/

        Collections.shuffle(this.deck); //we shuffle the deck when instantiated
    }

   /* public void shuffle(){
        Collections.shuffle(deck);
    }*/

    public Card drawCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public int size(){
        return deck.size();
    }
}
