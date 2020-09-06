public class Game {
    public static void play(){
        //initialize decks
        Deck deck = new Deck();

        //initialize points
        int player1 = 0;
        int player2 = 0;

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
                    player1 += card1.value - card2.value;
                    System.out.println("Player 1's card was greater!");
                    break;
                case 0:
                    int p1 = Card.colorValue(card1);
                    int p2 = Card.colorValue(card2);
                    if (p1 > p2){
                        player1++;
                        System.out.println("Player 1's card was greater!");
                    }else{
                        player2++;
                        System.out.println("Player 2's card was greater!");
                    }
                    break;
                case -1: //p2 card is better
                    System.out.println("Player 2's card was greater!");
                    player2+= card2.value - card1.value;
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
