package JavaSyntax;

import java.util.Scanner;

public class CharacterMultiplyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().trim().split(" ");
        String wordA;
        String wordB;
        if (text[0].length()>text[1].length()){
            wordA = text[0];
            wordB = text[1];
        }else{
            wordB = text[0];
            wordA = text[1];
        }
        long sum = calcTheSum(wordA,wordB);
        System.out.println(sum);
    }

    private static long calcTheSum(String wordA, String wordB) {
        long sum = 0;
        for (int i = 0; i <wordA.length() ; i++) {
            if (i<wordB.length()){
                sum+= (wordA.charAt(i)*(wordB.charAt(i)));
            }else {
                sum+= wordA.charAt(i);
            }
        }
        return sum;
    }
}
