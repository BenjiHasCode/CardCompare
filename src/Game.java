public class Game {
    Deck deck;
    int player1;
    int player2;

    public Game(){
        deck = new Deck();
        player1 = 0;
        player2 = 0;
    }

    public void play(){
        //initialize decks
        Deck deck = new Deck();

        //"play" game
        for (int i = 0; i < 26; i++){
            System.out.println("ROUND " + (i + 1) + "!");
            //draw cards
            Card card1 = deck.drawCard();
            System.out.println("Player 1 drew: " + card1);
            Card card2 = deck.drawCard();
            System.out.println("Player 2 drew: " + card2);
            //compare
            switch (card1.compareTo(card2)) {
                case 1: //p1 card is better
                    //award difference in card values to points
                    player1 += card1.value.ordinal() - card2.value.ordinal();
                    System.out.println("Player 1's card was greater!");
                    break;
                case 0://cards are equal
                    //find better color award +1 point
                    if (card1.color.ordinal() > card2.color.ordinal()){
                        player1++;
                        System.out.println("Player 1's card was greater!");
                    }else{
                        player2++;
                        System.out.println("Player 2's card was greater!");
                    }
                    break;
                case -1: //p2 card is better
                    System.out.println("Player 2's card was greater!");
                    player2+= card2.value.ordinal() - card1.value.ordinal();
                    break;
            }
            System.out.println("Player 1 Points: " + player1);
            System.out.println("Player 2 Points: " + player2);
            System.out.println("Remaining Cards: " + deck.size() + "\n");
        }

        if(player1 > player2)
            System.out.println("Player 1 won!");
        else
            System.out.println("Player 2 won!");
    }
}
