package enumy;

import java.util.ArrayList;
import java.util.List;

public class DemoHouseOfCards {

    public static void main(String[] args) {

        Card damaPik = new Card(Rank.QUEEN, Suit.SPADES);
        System.out.println(damaPik);
        Card dwojkaKaro = new Card(Rank.JACK, Suit.DIAMOND);
        System.out.println(dwojkaKaro);

        for (Rank rank : Rank.values()) {
            System.out.println(rank);
        }

        CardGame cardGame = new CardGame();
        cardGame.compareCards(damaPik, dwojkaKaro);

        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit: Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }

        System.out.println(cards);
        System.out.println(cards.size());
    }


}
