package JavaOOPAdvanced.EnumerationsAndAnnotations.customAnnotation.cardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardInfo crd = null;
        switch (scanner.nextLine()){
            case "Rank":
                crd = Rank.class.getAnnotation(CardInfo.class);
                System.out.printf("Type = Enumeration, Description = %s",crd.description());
                break;
            case "Suit":
                crd = Suit.class.getAnnotation(CardInfo.class);
                System.out.printf("Type = Enumeration, Description = %s",crd.description());
                break;
        }

//        while (firstPlayer.getSize() < 5){
//            try {
//                firstPlayer.addCard(deck.getCard(scanner.nextLine()));
//            }catch (IllegalArgumentException | IllegalStateException a){
//                System.out.println(a.getMessage());
//            }
//        }
//
//        while (secondPlayer.getSize() < 5){
//            try {
//                secondPlayer.addCard(deck.getCard(scanner.nextLine()));
//            }catch (IllegalArgumentException | IllegalStateException a){
//                System.out.println(a.getMessage());
//            }
//        }
//
//        Player winner = getWinner(firstPlayer,secondPlayer);
//        System.out.println(String .format("%s wins with %s. ",winner.getName(),winner.getHighestCard()));
//    }
//
//    private static Player getWinner(Player firstPlayer, Player secondPlayer) {
//        if (firstPlayer.getHighestCard().compareTo(secondPlayer.getHighestCard()) >0){
//            return firstPlayer;
//        }
//        return secondPlayer;
   }
}
