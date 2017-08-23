package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String,Double> graduationList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] scores = scanner.nextLine().split(" ");
            double sumOfScores = 0;
            for (String score : scores) {
                sumOfScores += Double.parseDouble(score);
            }
            graduationList.put(name,(sumOfScores/scores.length));
        }
        for (String key : graduationList.keySet()) {
            System.out.println(key + " is graduated with " + graduationList.get(key));
        }
    }
}