import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//bez skanera

  //  Card card=new Card( Ranks.ACE, Suits.CLUBS);
   // System.out.println(card.getDescription());

//ze skanerem z gwiazdką

        Scanner scaner=new Scanner(System.in);
        Card card2=new Card();
        System.out.println("Rodzaje figur: " );
        for (Ranks algo : Ranks.values()) {
            System.out.println(algo);
        }
        System.out.println("Wybierz figurę: ");

        card2.setRanks(Ranks.valueOf(scaner.next()));

        System.out.println("Rodzaje kolorów: " );
        for (Suits algo : Suits.values()) {
            System.out.println(algo);
        }

        System.out.println("Wybierz kolor: ");
        card2.setSuits(Suits.valueOf(scaner.next()));


        System.out.println(card2.getDescription());
    }
}
