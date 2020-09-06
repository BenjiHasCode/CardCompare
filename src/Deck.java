import java.util.*;
import java.util.function.Consumer;

public class Deck implements Iterable<Card>{
    private List<Card> deck = new ArrayList<>();

    public Deck(){
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
        Collections.shuffle(this.deck); //we shuffle the deck when instantiated
    }

    public Card drawCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public int size(){
        return deck.size();
    }

    @Override
    public Iterator<Card> iterator() {
        return deck.iterator();
    }

    @Override
    public void forEach(Consumer<? super Card> action) {

    }

    @Override
    public Spliterator<Card> spliterator() {
        return null;
    }
}
