package SetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Set<String>> personalHands = new LinkedHashMap<>();
        while (!input.equals("JOKER")){
            String[] datas = input.split(":");
            if (!personalHands.containsKey(datas[0])){
                personalHands.put(datas[0],new HashSet<>());
            }

            Set<String> top = personalHands.get(datas[0]);
            top.addAll(Arrays.asList(datas[1].trim().split("[\\s,]+")));
            personalHands.put(datas[0],top);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> hands : personalHands.entrySet()) {
            long sum = 0;
            Set<String> cards = hands.getValue();
            for (String card : cards) {
                int suitSize =0;
                int countSize = 0;
                switch (card.substring(card.length()-1)){
                    case "S": suitSize = 4;break;
                    case "H": suitSize = 3;break;
                    case "D": suitSize = 2;break;
                    case "C": suitSize = 1;break;
                }
                switch (card.substring(0,card.length()-1)){
                    case "A": countSize = 14;break;
                    case "K": countSize = 13;break;
                    case "Q": countSize = 12;break;
                    case "J": countSize = 11;break;
                    default:countSize = Integer.parseInt(card.substring(0,card.length()-1));
                        break;
                }
                sum += suitSize *countSize;
            }
            System.out.printf("%s: %d%n",hands.getKey(),sum);
        }
    }
}