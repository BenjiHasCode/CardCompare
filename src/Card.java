public class Card implements Comparable<Card>{
    Value value;
    Color color;

    public Card(Value value, Color color){
        this.color = color;
        this.value = value;
    }

    @Override
    public int compareTo(Card c) {
        return Integer.compare(value.ordinal(), c.value.ordinal());
    }

    public String toString(){
        return value + " of " + color;
    }
}
