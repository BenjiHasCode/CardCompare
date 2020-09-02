import java.util.Iterator;

public class Card implements Comparable<Card>, Iterable{
    int value;
    String name;
    String color;

    public Card(String name, String color){
        this.color = color;
        this.name = name;
        switch (name){
            case "Two":
                this.value = 2;
                break;
            case "Three":
                this.value = 3;
                break;
            case "Four":
                this.value = 4;
                break;
            case "Five":
                this.value = 5;
                break;
            case "Six":
                this.value = 6;
                break;
            case "Seven":
                this.value = 7;
                break;
            case "Eight":
                this.value = 8;
                break;
            case "Nine":
                this.value = 9;
                break;
            case "Ten":
                this.value = 10;
                break;
            case "Jack":
                this.value = 11;
                break;
            case "Queen":
                this.value = 12;
                break;
            case "King":
                this.value = 13;
                break;
            case "Ace":
                this.value = 14;
                break;
        }
    }

    @Override
    public int compareTo(Card c) {
        if (c.value < value)
            return 1;
        else if (c.value == value)
            return 0;
        else
            return -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
