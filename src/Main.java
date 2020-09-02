import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> list = new ArrayList<>();
        list.add(new Card("King","Diamonds"));
        list.add(new Card("King","Hearts"));
        list.add(new Card("Jack","Clubs"));
        list.add(new Card("Ace","Spades"));


        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i).compareTo(list.get(i+1)) > 0)
                System.out.println(list.get(i).name + " of " + list.get(i).color + " is greater than " + list.get(i+1).name + " of " + list.get(i+1).color);
            else if(list.get(i).compareTo(list.get(i+1)) == 0)
                System.out.println(list.get(i).name + " of " + list.get(i).color + " is equal to " + list.get(i+1).name + " of " + list.get(i+1).color);
            else
                System.out.println(list.get(i).name + " of " + list.get(i).color + " is less than " + list.get(i+1).name + " of " + list.get(i+1).color);
        }
    }
}
