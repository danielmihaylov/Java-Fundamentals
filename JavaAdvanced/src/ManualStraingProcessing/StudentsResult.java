package ManualStraingProcessing;


import java.util.*;

public class StudentsResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        TreeMap<String,List<Double>> result = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" - ");
            String[] examResultsLikeString = input[1].split(", ");

            List<Double> examResults = new ArrayList<>();
            double sum = 0;
            for (String res : examResultsLikeString) {
                double reminder = Double.parseDouble(res);
                sum += reminder;
                examResults.add(reminder);
            }
            examResults.add(sum /3);

            result.put(input[0],examResults);
        }
        if (number != 0){
            System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name","JAdv","JavaOOP","AdvOOP","Average"));
            for (String s : result.keySet()) {
                System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",s,result.get(s).get(0),result.get(s).get(1),result.get(s).get(2),result.get(s).get(3)).replace(".", ","));
            }
        }
    }
}