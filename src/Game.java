public class Game {
    public static void play(){
        //initialize decks
        Deck player1 = new Deck();
        Deck player2 = new Deck();

        //initialize points
        int p1Points = 0;
        int p2Points = 0;

        //"play" game
        for (int i = 0; i < 26; i++){
            System.out.println("ROUND " + (i + 1) + "!");
            //draw cards
            Card card1 = player1.drawCard();
            System.out.println("Player 1 drew: " + card1);
            Card card2 = player2.drawCard();
            System.out.println("Player 2 drew: " + card2);
            //compare
            switch (card1.compareTo(card2)){
                case 1: //p1 card is better
                    p1Points+= card1.value - card2.value;
                    System.out.println("Player 1's card was greater!");
                    break;
                case 0:
                    System.out.println("The Cards Are Equal!");
                    break;
                case -1: //p2 card is better
                    System.out.println("Player 2's card was greater!");
                    p2Points+= card2.value - card1.value;
                    break;
            }
            System.out.println("Player 1 Points: " + p1Points);
            System.out.println("Player 2 Points: " + p2Points + "\n");
        }

        if(p1Points > p2Points)
            System.out.println("Player 1 won!");
        else
            System.out.println("Player 2 won!");
    }
}
