import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck = new ArrayList<>();

    public Deck(){
        //for each color enum
        for(Color c : Color.values()){
            for(Value v : Value.values()){
                deck.add(new Card(v, c));
            }
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

    /*@Override
    public void forEach(Consumer<? super Card> action) {

    }

    @Override
    public Spliterator<Card> spliterator() {
        return null;
    }*/
}
