import java.util.Iterator;

public class Card implements Comparable<Card>{
    int value;
    String name;
    String color;

    public Card(String name, String color){
        this.color = color;
        this.name = name;
        switch (name){
            case "Ace":
                this.value = 14;
                break;
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
        }
    }

    public Card(int value, String color){
        this.color = color;
        this.value = value;
        switch (value){
            case 1:
                this.name = "Ace";
                break;
            case 2:
                this.name = "Two";
                break;
            case 3:
                this.name = "Three";
                break;
            case 4:
                this.name = "Four";
                break;
            case 5:
                this.name = "Five";
                break;
            case 6:
                this.name = "Six";
                break;
            case 7:
                this.name = "Seven";
                break;
            case 8:
                this.name = "Eight";
                break;
            case 9:
                this.name = "Nine";
                break;
            case 10:
                this.name = "Ten";
                break;
            case 11:
                this.name = "Jack";
                break;
            case 12:
                this.name = "Queen";
                break;
            case 13:
                this.name = "King";
                break;
        }
    }

    @Override
    public int compareTo(Card c) {
        return Integer.compare(value, c.value);
    }

    public String toString(){
        return name + " of " + color;
    }

    public static int colorValue(Card c){
        switch (c.color){
            case "Spade":
                return c.value + 3;
            case "Hearts":
                return c.value + 2;
            case "Diamond":
                return c.value + 1;
            case "Clubs":
                return c.value;
        }
        return -1;
    }
}
