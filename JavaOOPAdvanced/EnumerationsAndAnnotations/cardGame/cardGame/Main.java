package JavaOOPAdvanced.EnumerationsAndAnnotations.cardGame.cardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player firstPlayer = new Player(scanner.nextLine());
        Player secondPlayer = new Player(scanner.nextLine());
        Deck deck = new Deck();

        while (firstPlayer.getSize() < 5){
            try {
                firstPlayer.addCard(deck.getCard(scanner.nextLine()));
            }catch (IllegalArgumentException | IllegalStateException a){
                System.out.println(a.getMessage());
            }
        }

        while (secondPlayer.getSize() < 5){
            try {
                secondPlayer.addCard(deck.getCard(scanner.nextLine()));
            }catch (IllegalArgumentException | IllegalStateException a){
                System.out.println(a.getMessage());
            }
        }

        Player winner = getWinner(firstPlayer,secondPlayer);
        System.out.println(String .format("%s wins with %s. ",winner.getName(),winner.getHighestCard()));
    }

    private static Player getWinner(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.getHighestCard().compareTo(secondPlayer.getHighestCard()) >0){
            return firstPlayer;
        }
        return secondPlayer;
    }
}
