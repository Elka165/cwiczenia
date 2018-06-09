//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Card card2 = new Card();

        try {
            System.out.println("Rodzaje figur: ");
            Ranks[] var3 = Ranks.values();
            int var4 = var3.length;

            int var5;
            for(var5 = 0; var5 < var4; ++var5) {
                Ranks algo = var3[var5];
                System.out.println(algo);
            }

            System.out.println("Wybierz figurę: ");
            card2.setRanks(Ranks.valueOf(scaner.next()));
            System.out.println("Rodzaje kolorów: ");
            Suits[] var8 = Suits.values();
            var4 = var8.length;

            for(var5 = 0; var5 < var4; ++var5) {
                Suits algo = var8[var5];
                System.out.println(algo);
            }

            System.out.println("Wybierz kolor: ");
            card2.setSuits(Suits.valueOf(scaner.next()));
            System.out.println(card2.getDescription());
        } catch (IllegalArgumentException var7) {
            System.out.println("Jedno z wyrażeń jest spoza listy, spróbuj ponownie");
        }

    }
}
